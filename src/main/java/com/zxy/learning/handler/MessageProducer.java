package com.zxy.learning.handler;

import com.zxy.learning.thread.waitAndnotify.Resource;
import org.apache.commons.lang3.RandomUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @Title
 * @Description 
 * @Author zxy 
 * @Param 
 * @UpdateTime 2020/10/21 10:31 
 * @Return 
 * @throws 
 */
public class MessageProducer implements Runnable{

	private static Map<Integer, UserMessageCenter> userMessageCenterMap = new HashMap<>();

	private int uid;

	private int limit;

	private UserMessageCenter userMessageCenter;


	public MessageProducer(int uid, int limit){
		if(limit<=0){
		    limit = -1;
        }
		this.limit = limit;
		this.uid = uid;

        UserMessageCenter temp = userMessageCenterMap.get(uid);
        if(temp == null){
            temp = new UserMessageCenter();
            userMessageCenterMap.put(uid, temp);
        }
		this.userMessageCenter = temp;
	}

	@Override
	public void run() {
	    int recordNum = 0;
	    while (true){
	        if(recordNum == limit){
	            break;
            }
            synchronized (userMessageCenter) {
                userMessageCenter.addMessage(new Message(userMessageCenter.getAndADDMessageNumber(), uid, RandomUtils.nextInt(1,3)));
            }
            try {
                Thread.sleep(RandomUtils.nextInt(100, 2000));
            }catch (Exception e){

            }
        }
	}

}

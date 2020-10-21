package com.zxy.learning.handler;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author zxy
 * @version 1.0.0
 * @ClassName UserMessageCenter.java
 * @Description
 * @createTime 2020年10月21日 14:33:00
 */
public class UserMessageCenter implements Runnable{

    private BlockingQueue<Message> blockingQueue = new ArrayBlockingQueue<>(1024);

    private static ExecutorService userExecutorService = Executors.newFixedThreadPool(10);

    private static ExecutorService userMessageExecutorService = Executors.newFixedThreadPool(10);

    private volatile AtomicInteger state = new AtomicInteger(STATE_EMPTY);

    private static final int STATE_RUNNING = 1;

    private static final int STATE_EMPTY = 0;

    private static final int QUEUE_LIMIT = 100;

    private int message = 0;

    private int threadSleepMill = 100;

    public int getAndADDMessageNumber(){
        return ++message;
    }

    //增加信息
    public void addMessage(Message message){
        if (blockingQueue.size() < QUEUE_LIMIT) {
            blockingQueue.add(message);
            if (state.compareAndSet(STATE_EMPTY, STATE_RUNNING)) {
                executeThisCenter();
            }
        }
        //System.out.println(message.toString());
    }

    @Override
    public void run() {
        while(!blockingQueue.isEmpty()){
            Message runnable = blockingQueue.remove();
            executeTaskByType(runnable);
        }
        try {
            Thread.sleep(threadSleepMill);
        }catch (Exception e){
            System.out.println("0.0");
        } finally {
            state.set(STATE_EMPTY);
        }

    }

    public void executeTaskByType(Message runnable){
            executeSingle(runnable);
    }

    public void executeNonTransaction(Message runnable){
        userMessageExecutorService.submit(runnable);
    }

    //执行单个任务
    public void executeSingle(Runnable runnable){
        try {
            runnable.run();
        } catch (Exception e){
            System.out.println("0.0");
        }
    }

    //执行玩家的消息处理
    public void executeThisCenter(){
        userExecutorService.submit(this);
    }

}

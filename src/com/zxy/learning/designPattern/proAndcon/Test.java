package com.zxy.learning.designPattern.proAndcon;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

public class Test {
	public static void main(String[] args) throws InterruptedException{
		BlockingQueue<Resource> resource = new LinkedBlockingDeque<>(10);	
		Producer[] pro = new Producer[5];
		Consumer[] con = new Consumer[5];
		for(int i = 0; i < pro.length ; i ++) {
			pro[i] = new Producer(resource);
		}
        for(int i = 0; i < con.length ; i ++) {
        	con[i] = new Consumer(resource);
        }
        
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(pro[0]);
        service.execute(pro[1]);
        service.execute(pro[2]);
        service.execute(pro[3]);
        service.execute(pro[4]);
        service.execute(con[0]);
        service.execute(con[1]);
        service.execute(con[2]);
        service.execute(con[3]);
        service.execute(con[4]);        
        Thread.sleep(10*1000);
        pro[1].stop();
        pro[2].stop();
        pro[3].stop();
        Thread.sleep(3000);
        service.shutdown();
	} 
}

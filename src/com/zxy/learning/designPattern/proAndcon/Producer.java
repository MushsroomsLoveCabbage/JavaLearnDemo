package com.zxy.learning.designPattern.proAndcon;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Producer implements Runnable{
	private volatile boolean isRunning = true;
	private BlockingQueue<Resource> queue;
	private static AtomicInteger count = new AtomicInteger();
	private static final int SLEEPTIME = 1000;
	public Producer(BlockingQueue<Resource> queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
		Resource resource = null;
		Random r = new Random();
		System.out.println("start producting id:" + Thread.currentThread().getId());
		try {
			while (isRunning) {
				Thread.sleep(r.nextInt(SLEEPTIME));
				resource = new Resource(count.incrementAndGet());
				System.out.println("加入队列");
				if (!queue.offer(resource, 2, TimeUnit.SECONDS)) {
					System.out.println("加入队列失败");
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			Thread.currentThread().interrupt();
		} 
	}
	
	public void stop() {
		isRunning =false;
	}
	
}

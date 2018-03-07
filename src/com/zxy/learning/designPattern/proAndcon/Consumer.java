package com.zxy.learning.designPattern.proAndcon;

import java.text.MessageFormat;
import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
	private BlockingQueue<Resource> queue;
	private static final int SLEEPTIME = 1000;
	public Consumer(BlockingQueue<Resource> queue){
		this.queue = queue;
	}
	
	@Override
	public void run() {	
		System.out.println("start Consumer id :"+Thread.currentThread().getId());
		Random r = new Random();
		try {
			while (true) {
				Resource resource = queue.take();
				if(resource != null) {
					int re = resource.getData() * resource.getData();
					System.out.println(MessageFormat.format("{0}*{1}={2}", resource.getData(),resource.getData(),re));
			        Thread.sleep(r.nextInt(SLEEPTIME));
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}
	}

}

package com.zxy.learning.thread;

import java.util.concurrent.TimeUnit;

public class ShutDown {
	public static void main(String[] args) throws InterruptedException{
		Runner runner =  new Runner();
		Thread countThread = new Thread(runner,"runner");
		countThread.start();
		try {
			countThread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		countThread.interrupt();
		Runner other = new Runner();
		countThread = new Thread(other, "other");
		countThread.start();
		
		TimeUnit.SECONDS.sleep(1);
		try {
			countThread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		other.stopThread();
	}
	
	private static class Runner implements Runnable{
		private long i = 0; 
		private volatile boolean isRunning = true;
		@Override
		public void run() {
			while(isRunning){
				i++;
			}
			
		}
		
		public void stopThread(){
			isRunning = false;
		}
		
	}

}

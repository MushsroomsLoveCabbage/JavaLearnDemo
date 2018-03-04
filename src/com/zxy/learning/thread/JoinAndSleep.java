package com.zxy.learning.thread;

public class JoinAndSleep {
	public static void main(String[] args) throws InterruptedException{
		MyThread thread = new MyThread();
		thread.sleep(100);
		thread.join(100);
	}
}

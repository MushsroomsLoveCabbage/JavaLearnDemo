package com.zxy.learning.thread.waitAndnotify;

public class Test {
	public static void main(String[] args){
		Resource res = new Resource();
		
		new Thread(new Producer(res),"pro").start();
		new Thread(new Consumer(res),"pro").start();
	}
}

package com.zxy.learning.thread;

public class ThreadLocalTest {
	@SuppressWarnings("rawtypes")
	public static ThreadLocal t1 = new ThreadLocal();
	public static void main(String[] args){
		t1.set("1");
	}
}

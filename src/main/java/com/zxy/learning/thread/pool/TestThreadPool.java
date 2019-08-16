package com.zxy.learning.thread.pool;

import java.util.concurrent.atomic.AtomicInteger;

public class TestThreadPool {
	public static void main(String[] args){
		ThreadPool t = ThreadPool.getThreadPool();
		t.execute(new Runnable[] {
				new Task(), new Task(), new Task()
		});
		t.execute(new Runnable[] {
				new Task(), new Task(), new Task()
		});
		
		System.out.println(t);
		t.destory();
		System.out.println(t);
	}
	
	static class Task implements Runnable{
		private static volatile int i = 1;
		//private AtomicInteger i = new AtomicInteger(0);

		@Override
		public void run() {
			System.out.println("任务" + (i++) + "完成");
		}
		
	}
}

package com.zxy.learning.thread;

public class Test {
	public static void main(String[] args){
		try {
			MyThread thread = new MyThread();
			thread.setName("myThread");
			thread.start();
			for (int i = 0; i < 10; i++) {
				int time = (int) (Math.random() * 1000);
				Thread.sleep(time);
				System.out.println("main=" + Thread.currentThread().getName() + "----" + time);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//thread实现了runnable,所以也能做为Thead的构造参数
		Thread test = new Thread(new MyThread());
	}
}

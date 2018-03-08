package com.zxy.learning.thread.pool;

public class MyThread extends Thread{
    private boolean isRunning = true;  
	@Override
	public void run(){
		System.out.println(Thread.currentThread().getName() + "执行中");
	}
	
	 public void stopWorker() {  
         isRunning = false;  
     }  
}

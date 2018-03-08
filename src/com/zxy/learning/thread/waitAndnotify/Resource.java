package com.zxy.learning.thread.waitAndnotify;

public class Resource {
	private static int max = 30;
	private static int min = 0;
	private int i;
	public void add(){
		synchronized(Resource.class){
			while(i >= max){
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}				
			}
			i++;
			System.out.println(i);
			this.notifyAll();			
		}
	}
	public void reduce(){
		synchronized(Resource.class){
			while(i <= min){				
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}			
			i--;
			System.out.println(i);
			this.notifyAll();
			
		}
	}
}

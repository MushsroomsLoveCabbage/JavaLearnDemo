package com.zxy.learning.thread;

public class myRunnable implements Runnable{
	@Override
	public void run() {
		System.out.println("运行中!");
		System.out.println("eclipse 快捷键 alt + /");
	}
	
	Runnable object = new Runnable(){
		@Override
		public void run() {
			
		}
		
	};
}

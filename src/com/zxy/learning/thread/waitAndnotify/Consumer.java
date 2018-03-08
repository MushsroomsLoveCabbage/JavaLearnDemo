package com.zxy.learning.thread.waitAndnotify;

public class Consumer implements Runnable{
	private Resource resource;
	public Consumer(Resource resource){
		this.resource = resource;
	}
	@Override
	public void run() {
		resource.reduce();
	}

}

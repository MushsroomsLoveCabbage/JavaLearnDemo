package com.zxy.learning.thread.waitAndnotify;

public class Producer implements Runnable{
	private Resource resource;
	public Producer(Resource resource){
		this.resource = resource;
	}
	@Override
	public void run() {
		resource.add();
	}

}

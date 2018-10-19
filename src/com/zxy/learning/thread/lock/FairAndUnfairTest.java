package com.zxy.learning.thread.lock;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairAndUnfairTest {
	
	private static Lock fairLock = new ReentrantLock2(true);
	private static Lock unFairLock = new ReentrantLock2(false);
	public void fair(){
		testLock(fairLock);
	}
	
	public void unfari(){
		testLock(unFairLock);
	}
	public void testLock(Lock lock){
		Job[] jobs = new Job[5];
		for(int i = 0; i < jobs.length; i++){
			jobs[i] = new Job(lock);
			jobs[i].start();
		}
	}
	
	private static class Job extends Thread{
		private Lock lock;
		public Job(Lock lock){
			this.lock = lock;
		}
		public void run(){			
			/*for(Thread obj ){
				System.out.print(obj.getName());
			}*/
		}
	}
	private static class ReentrantLock2 extends ReentrantLock{
		public ReentrantLock2(Boolean fair){
			super(fair);
		}
		
		public Collection<Thread> getQueuedThreads() {
			List<Thread> arrayList = new ArrayList<Thread>(super.getQueuedThreads());
			Collections.reverse(arrayList);
			return arrayList;
		}
	}
}

package com.zxy.learning.thread.lock;

import java.util.concurrent.locks.ReentrantLock;

public class ReetrantLockBasic {
	public static void main(String[] args){
		ReentrantLock lock = new ReentrantLock();
		lock.lock();
	}
}

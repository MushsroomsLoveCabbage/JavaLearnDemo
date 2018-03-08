package com.zxy.learning.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TransferQueue;

public class Queue {
	public static void main(String[] args){
		
		Deque<String> deque = new LinkedBlockingDeque<String>();
		Deque<String> securityDeque = new ConcurrentLinkedDeque<String>();
		//BlockingDeque<String> arrayDeque = new ArrayBlockingQueue<String>();
		TransferQueue<String> linkedTransferQueue =  new LinkedTransferQueue<String>();
	}
}

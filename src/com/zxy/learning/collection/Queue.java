package com.zxy.learning.collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class Queue {
	public static void main(String[] args){
		List<String> list =  new LinkedList<String>();
		Deque<String> deque = new LinkedBlockingDeque<String>();
		Deque<String> securityDeque = new ConcurrentLinkedDeque<String>();
	}
}

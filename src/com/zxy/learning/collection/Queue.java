package com.zxy.learning.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class Queue {
	public static void main(String[] args){
		List<String> list =  new LinkedList<String>();
		List<Teacher> tList =  new LinkedList<Teacher>();
		//集合的排序，重写对象的比较方法
		Collections.sort(tList, new Comparator<Teacher>(){
			@Override
			public int compare(Teacher o1, Teacher o2) {
				return 0;
			}
			
		});
		
		Deque<String> deque = new LinkedBlockingDeque<String>();
		Deque<String> securityDeque = new ConcurrentLinkedDeque<String>();
	}
}

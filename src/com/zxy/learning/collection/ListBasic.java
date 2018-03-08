package com.zxy.learning.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListBasic {
	public void demo(){
		//动态数组 
		//空间动态增长 50%;
		//int newCapacity = oldCapacity + (oldCapacity >> 1);
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("String");
		//双向链表
		List<String> linkList = new LinkedList<String>();
		//并发list
		List<String> copyOnWrite = new CopyOnWriteArrayList<String>();
		
		List<String> list =  new LinkedList<String>();
		List<Teacher> tList =  new LinkedList<Teacher>();
		//集合的排序，重写对象的比较方法
		Collections.sort(tList, new Comparator<Teacher>(){
			@Override
			public int compare(Teacher o1, Teacher o2) {
				return 0;
			}
			
		});
	}

}

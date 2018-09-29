package com.zxy.learning.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 集合的基本操作
 * @author Administrator
 *
 */
public class ListBasic {
	/**
	 * 返回空集合的默认返回
	 */
	private final List<Integer> videoIds = new ArrayList<>();
	
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
	
	public static void main(String[] args) {
		List<Integer> ids = getIds();
		System.out.println(ids.size());
	}
	/**
	 *  批量删除 list 中的元素
	 *  sublist 生成的子集合关联到父集合，对子 或 父的操作都会互相影响
	 */
	public static void removeListElements() {
		List<Integer> ids = new ArrayList<>();
		ids.add(1);
		ids.add(2);
		ids.add(3);
		ids.add(4);
		ids.add(5);
		ids.add(6);
		ids.add(7);
		ids.add(8);
		ids.add(9);
		ids.add(10);
		ids.subList(0, 5).clear();
		for(Integer id : ids) {
			System.out.println(id);
		}
	}
	/**
	 * 返回的集合对象不要为null ,而是返回一个空的集合
	 * @return
	 */
	public static List<Integer> getIds(){
		List<Integer> ids = new ArrayList<>();
		
		if(ids.isEmpty()) {
			return Collections.emptyList();
		}else {
		    return new ArrayList<Integer>(ids);
		}
	}

}

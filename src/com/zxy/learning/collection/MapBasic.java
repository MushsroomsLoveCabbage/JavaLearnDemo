package com.zxy.learning.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

public class MapBasic {
	public static void main(String[] args){
		//负载因子，决定hashmap集合内容多少时扩容  默认容量是16  
		Float a = (float) 0.75;
		Map<String, String> hashmap = new HashMap<String, String>(64, a);
		String value = hashmap.put("1", "123");
		//允许key ,value 为null 
		hashmap.put(null, null);
		System.out.println(value);
		Map<String, String> hashtable = new Hashtable<String, String>();
		
		//hashtable.put("key", null);	 hashTable 不允许null
		//hashtable.get(null);		
		Map<String, String> treeMap = new TreeMap<String, String>();
		
		Set<String> treeSet =  new TreeSet<String>();
		Set<Student> set = new TreeSet<Student>();
		//二叉查找树
		Map<Teacher,String> map = new TreeMap<Teacher, String>();
		
		//并发map 分段式 上锁 
		Map<String, String> concurrentHashMap = new ConcurrentHashMap<String, String>();

	}
}

package com.zxy.learning.collection;

import java.util.*;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Title
 * @Description
 * @Author zxy
 * @Param
 * @UpdateTime 2019/3/7 14:24
 * @Return
 * @throws
 */
public class MapBasic {

	public static void main(String[] args){

		testLinkedHashMapPut();

	}

	public static void testLinkedHashMapPut(){
		Map<String, String> zeroMap = new LinkedHashMap<>(16, 0.75f, true);
		zeroMap.put("1","1");
		zeroMap.put("2","2");
		zeroMap.put("3","3");
		zeroMap.put("4","4");
		zeroMap.put("5","5");
		zeroMap.get("2");
		zeroMap.entrySet().stream().forEach((obj)->{
			System.out.println(obj.getValue());
		});
	}

	public static void testHashMapPut(){
		int i = 0;
		Map<String, String> zeroMap = new HashMap<>(0);
		zeroMap.put("1","1");
		Map<String, String> sixteemMap = new HashMap<>(16);
		sixteemMap.put("1","1");
	}


	public static void basicInfo(){
		//负载因子，决定hashmap集合内容占比多少时扩容  默认容量是16
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

	static final int hash(Object key) {
		int h;
		return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
	}

	/**
	 * @Title 重置初始容量的最大 2的幂次方数
	 * @Description 
	 * @Author zxy 
	 * @Param [cap]
	 * @UpdateTime 2019/3/7 15:07 
	 * @Return int
	 * @throws 
	 */
	static final int tableSizeFor(int cap) {
		int n = cap - 1;
		n |= n >>> 1;
		n |= n >>> 2;
		n |= n >>> 4;
		n |= n >>> 8;
		n |= n >>> 16;
		return (n < 0) ? 1 : (n >= 100000) ? 100000 : n + 1;
	}

}

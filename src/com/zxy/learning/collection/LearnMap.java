package com.zxy.learning.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class LearnMap {
	public static void main(String[] args){
		Float a = (float) 0.75;
		Map<String, String> hashmap = new HashMap<String, String>(50, a);
		String value = hashmap.put("1", "123");
		hashmap.put(null, null);
		System.out.println(value);
		Map<String, String> hashtable = new Hashtable<String, String>();
		hashtable.put(null, null);
		
	}
}

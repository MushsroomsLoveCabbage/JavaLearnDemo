/**
 * Creation Date:2017年10月30日-下午5:13:42
 * 
 * Copyright 2010-2017 © 中格软件 Inc. All Rights Reserved
 */
package com.zxy.learning.cache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/**
 * Description Of The Class<br/>
 * QQ:1363320658
 * 
 * @author 	赵翔宇
 * @version 1.0.0, 2017年10月30日-下午5:13:42
 * @since 2017年10月30日-下午5:13:42
 */
public class CacheManager {

	private static HashMap cacheMap = new HashMap();

	private Float val = null;

	private CacheManager() {
		super();
	}

	//获取布尔值的缓存
	public static boolean getSimpleFlag(String key){
		return (boolean)cacheMap.get(key);
	}

	public static long getServerStartdt(String key) {
		return (Long)cacheMap.get(key);
	}
	
	//设置布尔值的缓存   
	public synchronized static boolean setSimpleFlag(String key, boolean flag) {
		if(flag && getSimpleFlag(key)) {
			return false;
		} else {
			cacheMap.put(key, flag);
			return true;
		}
	}
	
	public synchronized static boolean setSimpleFlag(String key, long serverbegruntdt) {
		if(cacheMap.get(key) == null) {
			cacheMap.put(key, serverbegruntdt);
			return true;
		} else {
			return false;
		}
	}
	
	 //得到缓存。同步静态方法   
	private synchronized static Cache getCache(String key) {
		return (Cache)cacheMap.get(key);
	}
	
	 //判断是否存在一个缓存   
    private synchronized static boolean hasCache(String key) {   
        return cacheMap.containsKey(key);   
    }
    //清除所有缓存   
    public synchronized static void clearAll() {   
        cacheMap.clear();   
    }  
    //清除某一类特定缓存,通过遍历HASHMAP下的所有对象，来判断它的KEY与传入的TYPE是否匹配   
    public synchronized static void clearAll(String type) {
		Iterator i = cacheMap.entrySet().iterator();
		String key;
		ArrayList<String> arr = new ArrayList<String>();
		while(i.hasNext()) {
			Entry entry = (Entry) i.next();
			key =  (String) entry.getKey();
			if(key.startsWith(type)) {
				arr.add(key);
			}
		}
		for(int k = 0; k < arr.size(); k++) {
			clearOnly(arr.get(k));
		}
	}
    
	//清除指定缓存
	public synchronized static void clearOnly(String key){
		cacheMap.remove(key);
	}
	
	//载入缓存
	public synchronized static void putCache(String key, Cache obj) {
		cacheMap.put(key, obj);
	}
	
	//获取缓存信息   
	public static Cache getCacheInfo(String key) {
		if(hasCache(key)) {
			Cache cache = getCache(key);
			if(cacheExpired(cache)) {
				cache.setExpired(true);
			}
			return cache;
		} else {
			return null;
		}
	}
	
	//载入缓存信息 
	public static void putCacheInfo(String key, Cache obj, long dt, boolean expired) {
		Cache cache = new Cache();
		cache.setKey(key);
		cache.setTimeOut(dt + System.currentTimeMillis());//何时更新缓存
		cache.setVal(obj);
		cache.setExpired(expired);////缓存默认载入时，终止状态为FALSE
		cacheMap.put(key, cache);
	}
	
	//重写载入缓存信息方法   
	public static void putCacheInfo(String key, Cache obj,long dt) {
		Cache cache = new Cache();
		cache.setKey(key);
		cache.setTimeOut(dt + System.currentTimeMillis());
		cache.setVal(obj);
		cache.setExpired(false);
		cacheMap.put(key, cache);
	}
	
	//判断缓存是否终止  
	public static boolean cacheExpired(Cache cache) {
		if(null == cache) {
			return false;
		}
		long nowDt = System.currentTimeMillis();
		long cacheDt = cache.getTimeOut();
		if(nowDt < cacheDt || cacheDt <= 0) {
			return false;
		} else {
			return true;
		}
	}
	//获取缓存中的大小   
	public static int getCacheSize() {
		return cacheMap.size();
	}
	
	//获取指定类型大小
	public static int getCacheSize(String type) {
		int k = 0;
		Iterator i = cacheMap.entrySet().iterator();
		String key;
		while(i.hasNext()) {
			Entry entry = (Entry) i.next();
			key = (String) entry.getKey();
			if(key.indexOf(type) != -1) {
				k++;
			}
		}
		return k;
	}
	//获取所有的键值名称
	public static ArrayList<String> getCacheAllKey(){
		ArrayList a = new ArrayList();
		Iterator i = cacheMap.entrySet().iterator();
		while(i.hasNext()) {
			Entry entry = (Entry) i.next();
			a.add((String)entry.getKey());
		}
		return a;
	}
	 //获取缓存对象中指定类型 的键值名称   
	public static ArrayList<String> getCacheListkey(String type) {   
	     ArrayList a = new ArrayList();   
	     String key;   
	     Iterator i = cacheMap.entrySet().iterator();   
	     while (i.hasNext()) {   
	         java.util.Map.Entry entry = (java.util.Map.Entry) i.next();   
	         key = (String) entry.getKey();   
	         if (key.indexOf(type) != -1) {   
	             a.add(key);   
	         }   
	     } 
	    return a;
	 }   
}


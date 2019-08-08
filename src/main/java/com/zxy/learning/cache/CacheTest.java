/**
 * Creation Date:2017年11月6日-下午3:20:21
 * 
 * Copyright 2010-2017 © 中格软件 Inc. All Rights Reserved
 */
package com.zxy.learning.cache;

import java.util.Timer;

/**
 * Description Of The Class<br/>
 * QQ:1363320658
 * 
 * @author 	赵翔宇
 * @version 1.0.0, 2017年11月6日-下午3:20:21
 * @since 2017年11月6日-下午3:20:21
 */
public class CacheTest {
	static Timer timer;
	public static void TimerTest01(long time){        
		timer = new Timer();        
		timer.schedule(new TimerTaskTest(), (long)time * 60);    
	}  
	public static void main(String[] args) {
		Cache a = new Cache();
		a.setTimeOut((long) 30);
		a.setExpired(true);
		a.setVal("cacheA");
		a.setKey("a");
		CacheManager.putCache("a", a);
		Cache b = new Cache();
		a.setTimeOut((long) 120);
		a.setExpired(true);
		a.setVal("cacheB");
		a.setKey("b");
		CacheManager.putCache("b", b);
		System.out.println("start!");
		TimerTest01(1); 
		/*System.out.println(CacheManager.getSimpleFlag(""));
		CacheManager.putCache("abc", new Cache());
		CacheManager.putCache("def", new Cache());
		CacheManager.putCache("ghk", new Cache());
		CacheManager.clearOnly("");
		Cache c = new Cache();
		for(int i = 0;i < 10; i++) {
			CacheManager.putCache("", c);
		}
		CacheManager.putCache("aaaaaaaa", c);   
        CacheManager.putCache("abchcy;alskd", c);   
        CacheManager.putCache("cccccccc", c);         
        CacheManager.putCache("abcoqiwhcy", c);   
        System.out.println("删除前的大小："+CacheManager.getCacheSize());   
        CacheManager.getCacheAllKey();   
        CacheManager.clearAll("aaaa");   
        System.out.println("删除后的大小："+CacheManager.getCacheSize());   
        CacheManager.getCacheAllKey();  */
	}
}


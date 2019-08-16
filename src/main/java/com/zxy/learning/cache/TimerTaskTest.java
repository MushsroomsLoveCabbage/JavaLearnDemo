/**
 * Creation Date:2017年11月6日-下午3:40:53
 * 
 * Copyright 2010-2017 © 中格软件 Inc. All Rights Reserved
 */
package com.zxy.learning.cache;

import java.util.TimerTask;

/**
 * Description Of The Class<br/>
 * QQ:1363320658
 * 
 * @author 	赵翔宇
 * @version 1.0.0, 2017年11月6日-下午3:40:53
 * @since 2017年11月6日-下午3:40:53
 */
public class TimerTaskTest extends TimerTask{

	@Override
	public void run() {
		System.out.println(CacheManager.getCacheSize());
		//CacheManager.getCacheSize();
		CacheManager.getCacheAllKey();
	}

}


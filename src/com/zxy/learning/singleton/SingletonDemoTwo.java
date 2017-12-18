/**
 * Creation Date:2017年12月12日-上午9:24:10
 * 
 * 
 */
package com.zxy.learning.singleton;

/**
 * Description Of The Class<br/>
 * 
 * 
 * @author zxy
 * @Connect Mail:1363320658@qq.com
 * @version 1.0.0, 2017年12月12日-上午9:24:10
 * @since 2017年12月12日-上午9:24:10
 */
public class SingletonDemoTwo {
	private static SingletonDemoTwo instance;
	private SingletonDemoTwo() {
		
	}
	public static synchronized SingletonDemoTwo getInstance() {
		if(instance == null) {
			instance = new SingletonDemoTwo();
		}
		return instance;
	}
}


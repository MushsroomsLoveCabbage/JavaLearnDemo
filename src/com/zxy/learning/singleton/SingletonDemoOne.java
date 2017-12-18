/**
 * Creation Date:2017年12月12日-上午9:22:25
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
 * @version 1.0.0, 2017年12月12日-上午9:22:25
 * @since 2017年12月12日-上午9:22:25
 */
public class SingletonDemoOne {
	private static SingletonDemoOne instance;
	private SingletonDemoOne() {
		
	}
	public static SingletonDemoOne getInstance() {
		if(instance == null) {
			instance = new SingletonDemoOne();
		}
		return instance;
	}
}


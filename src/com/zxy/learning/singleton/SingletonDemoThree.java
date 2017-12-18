/**
 * Creation Date:2017年12月12日-上午9:26:50
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
 * @version 1.0.0, 2017年12月12日-上午9:26:50
 * @since 2017年12月12日-上午9:26:50
 */
public class SingletonDemoThree {
	private static SingletonDemoThree instance = new SingletonDemoThree();
	private SingletonDemoThree() {
		
	}
	private static SingletonDemoThree getInstance() {
		return instance;
	}
	
}


/**
 * Creation Date:2017年12月12日-上午9:30:07
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
 * @version 1.0.0, 2017年12月12日-上午9:30:07
 * @since 2017年12月12日-上午9:30:07
 */
public class SingletonDemoFour {
	private static SingletonDemoFour instance = null;
	static {
		instance = new SingletonDemoFour();
	}
	private SingletonDemoFour() {
		
	}
	public SingletonDemoFour getInstance() {
		return this.instance;
	}
}


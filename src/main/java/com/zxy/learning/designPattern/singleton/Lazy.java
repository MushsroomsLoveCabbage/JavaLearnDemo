/**
 * Creation Date:2017年12月12日-上午9:22:25
 * 
 * 
 */
package com.zxy.learning.designPattern.singleton;

/**
 * Description Of The Class<br/>
 * 懒汉式
 * 
 * @author zxy
 * @Connect Mail:1363320658@qq.com
 * @version 1.0.0, 2017年12月12日-上午9:22:25
 * @since 2017年12月12日-上午9:22:25
 */
public class Lazy {
	private static Lazy instance;
	private Lazy() {
		
	}
	public static Lazy getInstance() {
		if(instance == null) {
			instance = new Lazy();
		}
		return instance;
	}
}


/**
 * Creation Date:2017年12月12日-上午9:24:10
 * 
 * 
 */
package com.zxy.learning.designPattern.singleton;

/**
 * Description Of The Class<br/>
 *  懒汉式，线程安全，效率低，
 * 
 * @author zxy
 * @Connect Mail:1363320658@qq.com
 * @version 1.0.0, 2017年12月12日-上午9:24:10
 * @since 2017年12月12日-上午9:24:10
 */
public class LazySafe {
	private static LazySafe instance;
	private LazySafe() {
		
	}
	public static synchronized LazySafe getInstance() {
		if(instance == null) {
			instance = new LazySafe();
		}
		return instance;
	}
}


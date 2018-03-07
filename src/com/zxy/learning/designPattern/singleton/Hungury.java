/**
 * Creation Date:2017年12月12日-上午9:30:07
 * 
 * 
 */
package com.zxy.learning.designPattern.singleton;

/**
 * Description Of The Class<br/>
 * 
 * 饿汉式，静态代码块
 * @author zxy
 * @Connect Mail:1363320658@qq.com
 * @version 1.0.0, 2017年12月12日-上午9:30:07
 * @since 2017年12月12日-上午9:30:07
 */
public class Hungury {
	private static Hungury instance = null;
	static {
		instance = new Hungury();
	}
	private Hungury() {
		
	}
	public Hungury getInstance() {
		return instance;
	}
}


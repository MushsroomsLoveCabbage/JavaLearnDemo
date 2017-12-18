/**
 * Creation Date:2017年12月12日-上午9:35:36
 * 
 * 
 */
package com.zxy.learning.singleton;

/**
 * 双重校验加锁
 * 被volatile修饰的变量的值，将不会被本地线程缓存，
 * 所有对该变量的读写都是直接操作共享内存。
 * Description Of The Class<br/>
 * 
 * 
 * @author zxy
 * @Connect Mail:1363320658@qq.com
 * @version 1.0.0, 2017年12月12日-上午9:35:36
 * @since 2017年12月12日-上午9:35:36
 */
public class SingletonDemoFive {
	private volatile static SingletonDemoFive singleton;
	private SingletonDemoFive() {
		
	}
	public static SingletonDemoFive getInstance() {
		if(singleton == null) {
			synchronized (SingletonDemoFive.class) {
				if(singleton == null) {
					singleton = new SingletonDemoFive();
				}
			}
		}
		return singleton;
	}
}


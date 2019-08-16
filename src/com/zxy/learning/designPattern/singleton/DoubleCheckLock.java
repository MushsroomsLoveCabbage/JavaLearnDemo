/**
 * Creation Date:2017年12月12日-上午9:35:36
 * 
 * 
 */
package com.zxy.learning.designPattern.singleton;

/**
 * 双重校验加锁
 * 被volatile修饰的变量的值，将不会被本地线程缓存，
 * 所有对该变量的读写都是直接操作共享内存。
 * Description Of The Class<br/>
 * 
 * 对象必须是volatile ，不然会出现下面的错误（禁止重排序来实现安全）
 * 除了静态变量的延迟初始化，
 * 实例变量也会延迟初始化
 * 
 * @author zxy
 * @Connect Mail:1363320658@qq.com
 * @version 1.0.0, 2017年12月12日-上午9:35:36
 * @since 2017年12月12日-上午9:35:36
 */
public class DoubleCheckLock {

	private volatile static DoubleCheckLock singleton;

	private DoubleCheckLock() {
		
	}

	public static DoubleCheckLock getInstance() {
		if(singleton == null) {
			synchronized (DoubleCheckLock.class) {
				if(singleton == null) {
					//singleton = new DoubleCheckLock();
					//可以分解为三个伪代码，并且被重排序 导致对象并未被初始化。
					// 1,分配对象内存空间。2，singleton指向分配额内存空间。3，初始化对象
					//132 (A)-> 123 (B)
					//线程A 执行到第二步时，线程B误认为已经初始化，导致B获取的是一个未初始化对象。
					singleton = new DoubleCheckLock();
				}
			}
		}
		return singleton;
	}
}


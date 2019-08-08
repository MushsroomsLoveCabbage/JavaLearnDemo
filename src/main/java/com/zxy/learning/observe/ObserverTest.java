/**
 * Creation Date:2017年12月13日-下午4:11:45
 * 
 * 
 */
package com.zxy.learning.observe;

/**
 * 观察者模式，通过观察类来实现!
 * 监听观察对象，以及对象的变化！
 * 有变化回调观察者
 * Description Of The Class<br/>
 * 
 * 
 * @author zxy
 * @Connect Mail:1363320658@qq.com
 * @version 1.0.0, 2017年12月13日-下午4:11:45
 * @since 2017年12月13日-下午4:11:45
 */
public class ObserverTest {
	public static void main(String[] args) {
		ObserveTarget ot = new ObserveTarget(10000);
		OtherObserverTarget oot1 = new OtherObserverTarget("观察者1!");
		OtherObserverTarget oot2 = new OtherObserverTarget("观察者2!");
		OtherObserverTarget oot3 = new OtherObserverTarget("观察者3!");
		ot.addObserver(oot1);
		ot.addObserver(oot2);
		ot.addObserver(oot3);
		ot.countObservers();
		System.out.println(ot.getPrice());
		ot.setPrice(20000);
		System.out.println(ot.getPrice());
	}
}


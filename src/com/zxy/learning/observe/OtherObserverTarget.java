/**
 * Creation Date:2017年12月13日-下午4:09:16
 * 
 * 
 */
package com.zxy.learning.observe;

import java.util.Observable;
import java.util.Observer;

/**
 * Description Of The Class<br/>
 * 
 * 
 * @author zxy
 * @Connect Mail:1363320658@qq.com
 * @version 1.0.0, 2017年12月13日-下午4:09:16
 * @since 2017年12月13日-下午4:09:16
 */
public class OtherObserverTarget implements Observer{
	private String name;
	public OtherObserverTarget(String name) {
		this.name = name;
	}
	@Override
	public void update(Observable o, Object arg) {
		if(arg instanceof Float) {
			System.out.println(this.name + "观察到变化：" + ((Float)arg).floatValue());
		}
		
	}
	
}


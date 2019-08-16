/**
 * Creation Date:2017年12月7日-下午2:29:03
 * 
 * 
 */
package com.zxy.learning.spring.ioc;

/**
 * Description Of The Class<br/>
 * 
 * 
 * @author zxy
 * @Connect Mail:1363320658@qq.com
 * @version 1.0.0, 2017年12月7日-下午2:29:03
 * @since 2017年12月7日-下午2:29:03
 */
public class Factory {
	public static Fruit getInstance(String className) {
		Fruit fruit = null;
		try {
			fruit = (Fruit)Class.forName(className).newInstance();
		} catch (InstantiationException e) {
			
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		return fruit;
		
	}

}


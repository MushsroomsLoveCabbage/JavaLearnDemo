/**
 * Creation Date:2017年12月11日-上午9:25:00
 * 
 * 
 */
package com.zxy.learning.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**动态代理  
 * 代理对象不需要实现接口,但是目标对象一定要实现接口,否则不能用动态代理
 * Description Of The Class<br/>
 * 
 * 
 * @author zxy
 * @Connect Mail:1363320658@qq.com
 * @version 1.0.0, 2017年12月11日-上午9:25:00
 * @since 2017年12月11日-上午9:25:00
 */
public class ProxyFactory {
	private Object target;
	public ProxyFactory(Object target) {
		this.target = target;
	}
	
	public Object getProxyInstance() {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(), 
				new InvocationHandler() {

					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("前置事物");
						Object returnValue = method.invoke(target, args);
						System.out.println("后置事物");
						return returnValue;
					}
			
		});
	}
}


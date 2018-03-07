/**
 * Creation Date:2017年12月11日-上午9:43:32
 * 
 * 
 */
package com.zxy.learning.designPattern.proxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * Description Of The Class<br/>
 * 
 * 
 * @author zxy
 * @Connect Mail:1363320658@qq.com
 * @version 1.0.0, 2017年12月11日-上午9:43:32
 * @since 2017年12月11日-上午9:43:32
 */
public class CglibProxyFactory implements MethodInterceptor{
	private Object target;
	public CglibProxyFactory(Object target) {
		this.target = target;
	}
	public Object getProxyInstance() {
		//1.工具类
		Enhancer en = new Enhancer();
		
		en.setSuperclass(target.getClass());
		
		en.setCallback(this);
		
		return en.create();
	}
	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		System.out.println("开始事务...");
		Object returnValue = arg1.invoke(target, arg2);
		System.out.println("提交事务");
		return returnValue;
	}

}


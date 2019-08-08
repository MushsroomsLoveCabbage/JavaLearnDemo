//package com.zxy.learning.designPattern.proxy;
//
//import java.lang.reflect.Method;
//
//import org.springframework.cglib.proxy.InvocationHandler;
//
//public class MyInterceptor implements InvocationHandler{
//
//	private Object target;
//	public MyInterceptor(Object target){
//		this.target = target;
//	}
//
//	@Override
//	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//		System.out.println("before method");
//		method.invoke(this.target, args);
//		System.out.println("after method");
//		return null;
//	}
//
//}

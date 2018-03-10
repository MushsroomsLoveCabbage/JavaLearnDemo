/**
 * Creation Date:2017年12月11日-上午9:17:48
 * 
 * 
 */
package com.zxy.learning.designPattern.proxy;

/**
 * Description Of The Class<br/>
 * 
 * 
 * @author zxy
 * @Connect Mail:1363320658@qq.com
 * @version 1.0.0, 2017年12月11日-上午9:17:48
 * @since 2017年12月11日-上午9:17:48
 */
public class UserServiceTest {
	public static void main(String[] args) {
		//普通代理模式
		//UserService userService = new UserServiceProxy();
		//userService.getUser("111");	
		
		String arg = "tesla";
		//JDK动态代理
		//需要目标对象实现接口
		
		
		UserService userService = new UserServiceImpl();
		UserService jdkProxy = (UserService)new ProxyFactory(userService).getProxyInstance();	
		jdkProxy.getUser(arg);
		
		
		 //代理对象
		UserServiceImpl cglibProxy = (UserServiceImpl)new CglibProxyFactory(userService).getProxyInstance();
        //执行代理对象的方法
		cglibProxy.getUser(arg);
		
		
	}
}


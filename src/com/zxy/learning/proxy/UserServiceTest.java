/**
 * Creation Date:2017年12月11日-上午9:17:48
 * 
 * 
 */
package com.zxy.learning.proxy;

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
		//普通代理方式
		/*UserService userService = new UserServiceImpl();
		UserServiceProxy userServiceProxy = new UserServiceProxy(userService);
		userServiceProxy.getUser();*/
		
		//JDK动态代理
		/*UserService userService = new UserServiceImpl();
		System.out.println(userService.getClass());		
		UserService proxy = (UserService)new ProxyFactory(userService).getProxyInstance();
		System.out.println(proxy.getClass());
		String arg = "tesla";
		proxy.getUser(arg);*/
		
		UserService userService = new UserServiceImpl();
		 //代理对象
		UserServiceImpl proxy = (UserServiceImpl)new CglibProxyFactory(userService).getProxyInstance();
        //执行代理对象的方法
		String arg = "tesla";
		proxy.getUser(arg);
		
		
	}
}


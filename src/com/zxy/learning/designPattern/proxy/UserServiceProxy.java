/**
 * Creation Date:2017年12月11日-上午9:13:00
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
 * @version 1.0.0, 2017年12月11日-上午9:13:00
 * @since 2017年12月11日-上午9:13:00
 */
public class UserServiceProxy implements UserService{
	private UserService userService;
	public UserServiceProxy() {
		this.userService = new UserServiceImpl();
	}
	@Override
	public void getUser(String arg) {
		System.out.println("代理前置事物");
		userService.getUser(arg);
		System.out.println("代理后置事物");
	}
}


/**
 * Creation Date:2017年12月11日-上午9:11:27
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
 * @version 1.0.0, 2017年12月11日-上午9:11:27
 * @since 2017年12月11日-上午9:11:27
 */
public class UserServiceImpl implements UserService{

	@Override
	public void getUser(String arg) {
		System.out.println("获取到用户!");	
	}
	
}


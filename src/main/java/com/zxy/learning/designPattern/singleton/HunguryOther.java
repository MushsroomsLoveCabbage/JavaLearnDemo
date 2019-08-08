/**
 * Creation Date:2017年12月12日-上午9:26:50
 * 
 * 
 */
package com.zxy.learning.designPattern.singleton;

/**
 * Description Of The Class<br/>
 * 饿汉式 静态常量 
 * 
 * @author zxy
 * @Connect Mail:1363320658@qq.com
 * @version 1.0.0, 2017年12月12日-上午9:26:50
 * @since 2017年12月12日-上午9:26:50
 */
public class HunguryOther {
	private static HunguryOther instance = new HunguryOther();
	private HunguryOther() {
		
	}
	private static HunguryOther getInstance() {
		return instance;
	}
	
}


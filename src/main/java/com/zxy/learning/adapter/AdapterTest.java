/**
 * Creation Date:2017年12月13日-下午4:24:18
 * 
 * 
 */
package com.zxy.learning.adapter;

/**
 * Description Of The Class<br/>
 * 适配器模式，
 * 将某个类，接口，对象，转换成我们需要的类！（）
 * 
 * 
 * @author zxy
 * @Connect Mail:1363320658@qq.com
 * @version 1.0.0, 2017年12月13日-下午4:24:18
 * @since 2017年12月13日-下午4:24:18
 */
public class AdapterTest {
	public static void main(String[] args) {
		BasicFactory bc = new BasicAdapterImpl();
		bc.run();
	}
}


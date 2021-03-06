package com.zxy.learning.designPattern.factory;

/**
 * 静态工厂模式
 * 根据不同的需要 生产特定的对象
* @ClassName: Test
* @Description: 工厂方法模式（Factory Method）
* @author zxy 1363320658@qq.com
* @date 2018年3月5日 下午4:18:58
*
 */
public class Test {
	public static void main(String[] args){
		Factory factory = new Factory();
		Sender se = factory.produce("mail");
		se.send();
	}
}

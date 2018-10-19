package com.zxy.learning.designPattern.abstractFactory;
/**
 * 抽象工厂模式 
 * 添加新的产品 时只需要新建工厂类实现producer 和产品类实现Sender
* @ClassName: Test
* @Description: TODO(这里用一句话描述这个类的作用)
* @author zxy 1363320658@qq.com
* @date 2018年3月5日 下午3:53:14
*
 */
public class Test {
	public static void main(String[] args){
		productService(new SendSmsFactory());
	}
	
	public static void productService(Factory pro){
		Sender sen = pro.produce();
		sen.Send();
	} 
}

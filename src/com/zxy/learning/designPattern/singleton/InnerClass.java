package com.zxy.learning.designPattern.singleton;

/**
 * 静态内部类 在实例化的时候，才装载类，完成实例化！
* @ClassName: InnerClass
* @Description: TODO(这里用一句话描述这个类的作用)
* @author zxy 1363320658@qq.com
* @date 2018年3月5日 下午4:32:40
*
 */
public class InnerClass {
	private InnerClass(){}
	
	private static class SingletonInstance{
		private static final InnerClass instance =  new InnerClass();
	}
	public static InnerClass getInstance() {
		return SingletonInstance.instance;
	}
	
	public void run(){
		
	}
}

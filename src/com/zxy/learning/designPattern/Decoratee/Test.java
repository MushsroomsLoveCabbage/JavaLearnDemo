package com.zxy.learning.designPattern.Decoratee;

/**
 * 装饰器模式 
 * 需要指定装饰的类
 * 
 * 使用代理模式，代理和真实对象之间的的关系通常在编译时就已经确定了，
 * 而装饰者能够在运行时递归地被构造。    
* @ClassName: Test
* @Description: TODO(这里用一句话描述这个类的作用)
* @author zxy 1363320658@qq.com
* @date 2018年3月5日 下午5:44:06
*
 */
public class Test {
	public static void main(String[] args){
		Sourceable source = new DecoraterOther(new Decorater(new Source()));
		source.method();
	}
}

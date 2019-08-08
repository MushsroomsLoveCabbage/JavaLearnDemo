package com.zxy.learning.designPattern.adapter;
/**
 * 适配器模式
 * 复用现有的类，同时不改动。
* @ClassName: Test
* @Description: TODO(这里用一句话描述这个类的作用)
* @author zxy 1363320658@qq.com
* @date 2018年3月5日 下午5:03:01
*
 */
public class Test {
	public static void main(String[] args){
		Target target = new Adapter();
		target.method01();
		target.method02();
	}
}

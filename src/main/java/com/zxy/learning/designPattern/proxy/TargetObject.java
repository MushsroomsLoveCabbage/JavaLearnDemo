package com.zxy.learning.designPattern.proxy;

/**
 * 目标类
* @ClassName: TargetObject
* @Description: TODO(这里用一句话描述这个类的作用)
* @author zxy 1363320658@qq.com
* @date 2018年3月10日 下午4:03:20
*
 */
public class TargetObject implements TargetInterface{

	@Override
	public void method() {
		System.out.println("method!");
	}

}

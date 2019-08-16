package com.zxy.learning.designPattern.bridge;

/**
 * 桥接模式 
 * JDBC驱动中使用到 
 * 
* @ClassName: Test
* @Description: TODO(这里用一句话描述这个类的作用)
* @author zxy 1363320658@qq.com
* @date 2018年3月5日 下午10:17:33
*
 */
public class Test {
	public static void main(String[] args) {
		Bridge bridge = new MyBridge();
		Sourceable source01 = new SourceSub01();
		bridge.setSource(source01);
		bridge.method();
		
		Sourceable source02 = new SourceSub02();
		bridge.setSource(source02);
		bridge.method();
	}

}

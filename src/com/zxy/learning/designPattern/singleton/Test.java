package com.zxy.learning.designPattern.singleton;
/**
 * 单例模式适用场景
 * 
    1.需要频繁的进行创建和销毁的对象；
    2.创建对象时耗时过多或耗费资源过多，但又经常用到的对象；
    3.工具类对象；
    4.频繁访问数据库或文件的对象。

* @ClassName: Test
* @Description: TODO(这里用一句话描述这个类的作用)
* @author zxy 1363320658@qq.com
* @date 2018年3月5日 下午4:39:59
*
 */
public class Test {
	public static void main(String[] args){
		InnerClass in = InnerClass.getInstance();
		in.run();
	}
	
	
}

package com.zxy.learning.classLoader;

public class FatherClass {
	static{
		System.out.println("父类， 静态代码块");
	}
	
	{
		System.out.println("父类， 代码块");
	}
	
	public FatherClass(){
		System.out.println("父类，无参构造方法！");
	}
	public FatherClass(String name){
		System.out.println("父类， 有参构造函数！" + name);
	}
}

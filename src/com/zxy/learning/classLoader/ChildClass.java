package com.zxy.learning.classLoader;

public class ChildClass extends FatherClass{
	static{
		System.out.println("子类， 静态代码块");
	}
	
	{
		System.out.println("子类， 代码块");
	}
	
	public ChildClass(){
		super();
		System.out.println("子类，无参构造方法！");
	}
	public ChildClass(String name){
		super(name);
		System.out.println("子类， 有参构造函数！" + name);
	}

}

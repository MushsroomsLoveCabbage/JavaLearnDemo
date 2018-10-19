package com.zxy.learning.designPattern.Decoratee;

public class Decorater implements Sourceable{
	
	private Sourceable source;
	public Decorater(Sourceable source){
		super();
		this.source = source;
	}
	@Override
	public void method() {
		methodBefore();
		source.method();
		methodAfter();
	}
	
	public void methodAfter(){
		System.out.println("第一级 装饰   前 ");
	}
	public void methodBefore(){
		System.out.println("第一级 装饰   后 ");
	}

}

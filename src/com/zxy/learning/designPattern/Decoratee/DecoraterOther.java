package com.zxy.learning.designPattern.Decoratee;

public class DecoraterOther implements Sourceable{

	private Decorater decorater;

	public DecoraterOther(Decorater decorater){
		this.decorater = decorater;
	}
	
	@Override
	public void method() {
		methodBefore();
		decorater.method();
		methodAfter();
	}
	
    public void methodAfter(){
    	System.out.println("第二级 装饰   后 ");
	}

	public void methodBefore(){
		System.out.println("第二级 装饰   前");
	} 
}

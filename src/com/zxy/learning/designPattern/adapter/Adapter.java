package com.zxy.learning.designPattern.adapter;

public class Adapter implements Target{
	private Adaptee adaptee;
	public Adapter(Adaptee adaptee){
		this.adaptee = adaptee;
	}
	@Override
	public void method01() {
		adaptee.method01();
	}

	@Override
	public void method02() {
		System.out.println("adapter method");
	}
	

}

package com.zxy.learning.designPattern.adapter;

public class Adapter extends Adaptee implements Target{	

	@Override
	public void method02() {
		System.out.println("adapter method");
	}
	

}

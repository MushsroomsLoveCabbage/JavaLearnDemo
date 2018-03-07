package com.zxy.learning.designPattern.abstractFactory;

public class SmsSender implements Sender{

	@Override
	public void Send() {
		System.out.println("Sms send!");		
	}
	
}

package com.zxy.learning.designPattern.abstractFactory;

public class SendSmsFactory implements Factory{

	@Override
	public Sender produce() {
		return new SmsSender();
	}

}

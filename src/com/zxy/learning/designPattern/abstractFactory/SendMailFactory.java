package com.zxy.learning.designPattern.abstractFactory;

public class SendMailFactory implements Factory{

	@Override
	public Sender produce() {
		return new MailSender();
	}

}

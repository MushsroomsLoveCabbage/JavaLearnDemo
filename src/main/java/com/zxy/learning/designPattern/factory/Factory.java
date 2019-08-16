package com.zxy.learning.designPattern.factory;

public class Factory {
	public Sender produce(String type) {
		if("mail".equals(type)) {
			return new MailSender();
		} else if("sms".equals(type)) {
			return new SmsSender();
		} else {
			//提示报错
			return null;
		}
	}
}

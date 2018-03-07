package com.zxy.learning.designPattern.factory;

public class Factory {
	public static Sender produceMail(){
		return new MailSender();
	} 
	public static Sender produceSms(){
		return new SmsSender();
	}
}

package com.zxy.learning.designPattern.abstractFactory;

public class MailSender implements Sender{

	@Override
	public void Send() {
		System.out.println("mail Send");		
	}

}

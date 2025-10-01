package com.eastern.EmailSender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmailSenderApplication {
	@Autowired
	private emailSend sender;
	public static void main(String[] args) {
		SpringApplication.run(EmailSenderApplication.class, args);
		
		
	}
	@EventListener(ApplicationReadyEvent.class)
	public void sendMail()
	{
		sender.sendEmail("easternnguyen6@gmail.com", "12345");
	}
}

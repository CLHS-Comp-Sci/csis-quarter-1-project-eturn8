package com.eastern.EmailSender;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
@SpringBootApplication
public class EmailSenderApplication 
{
	@Autowired
		private emailSend sender;
		private static String email= "";
		private static String password=OTP.createOTP();
		private static String check=password;
		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			System.out.println("email:");
			email=input.nextLine();
			SpringApplication.run(EmailSenderApplication.class, args);
			System.out.println("Enter your 6 digit code in your email.");
			String codeInput= input.nextLine();
			if(OTP.checkPass(codeInput))
			{
				System.out.println("You have been verified.");
			}
			else
			{
				System.out.println("Try again");
			}
		}
	@EventListener(ApplicationReadyEvent.class)
	public void sendMail()
	{
		sender.sendEmail(email,password);
	}
}


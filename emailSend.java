package com.eastern.EmailSender;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
@Service
public class emailSend {
@Autowired
private JavaMailSender mailSender;
public void sendEmail(String to, String code)
{
    Scanner input=new Scanner(System.in);
    SimpleMailMessage message= new SimpleMailMessage();
    message.setFrom("easterncodetester@gmail.com");
    message.setTo(to);
    message.setSubject("This is your code.");
    message.setText(code);
    mailSender.send(message);
}   
}

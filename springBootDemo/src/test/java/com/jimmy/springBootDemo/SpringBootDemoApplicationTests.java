package com.jimmy.springBootDemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private JavaMailSender mailSender;
	@Test
	public void sendSimpleMail() {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("jimmycoding@sina.com");
		message.setTo("jimmycoding@sina.com");
		message.setSubject("主题：简单邮件");
		message.setText("测试邮件内容");
		message.setBcc("11670782@qq.com");
		message.setSentDate(new Date());

		try{
			mailSender.send(message);
		} catch (MailException e) {
			System.out.println(e.getMessage());
		}

	}



}

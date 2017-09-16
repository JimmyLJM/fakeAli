package com.jimmy.springBootDemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
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

	@Test
	public void sendAttachmentsEmail() throws MessagingException {
		MimeMessage mimeMessage =  mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

		//基本设置.
		helper.setFrom("jimmycoding@sina.com");//发送者.
		helper.setTo("jimmycoding@sina.com");//接收者.
		helper.setSubject("测试附件（邮件主题）");//邮件主题.
		helper.setText("这是邮件内容（有附件哦.）");//邮件内容.

		FileSystemResource file1 = new FileSystemResource(new File("D:/87097.jpg"));

		helper.addAttachment("附件.jpg", file1);
		mailSender.send(mimeMessage);
	}


}

package com.jimmy.springBootDemo.service;

import javax.mail.MessagingException;

/**
 * author : jimmyLJM on 2017-09-14
 * 邮件服务
 */
public interface SysMailService {

    public void sendSimpleMail();           // 简单邮件
    public void sendAttachmentsEmail() throws MessagingException;     // 带附件邮件
    public void sendResouceMail();          // 静态资源邮件
    public void sendTemplateMail();         // 模板邮件
}
pom
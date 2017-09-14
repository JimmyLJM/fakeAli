package com.jimmy.springBootDemo.util;





import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import java.util.Properties;

/**
 * author : jimmyLJM on 2017-09-13
 * 邮件工具类
 */
@ConfigurationProperties(prefix = "mymail")
public class MailUtil {

    private static String host;

    private static String username;

    private static String password;


    public static  void main(String agrs[]) {
        System.out.println(host);
    }

    public static void sendSimple(){
        // javaMail发送邮件五个步骤

        // 1、创建session

        // 2、通过session获取transport对象

        // 3、使用邮箱的用户名和密码连上邮件服务器，发送邮件时，
        //   发件人需要提交邮箱的用户名和密码给smtp服务器，用户名和密码都通过验证之后才能够正常发送邮件给收件人。

        // 4、创建邮件

        // 5、发送邮件并关闭transport
    }


    public static Session createSession() {


        Properties properties = new Properties();
        properties.setProperty("mail.host", host);        // 指定主机
        properties.setProperty("mail.smtp.auth", "true"); // 指定验证为true

        // 创建验证器
        Authenticator auth = new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        };


        return Session.getInstance(properties, auth);

    }


    public static String getHost() {
        return host;
    }

    public static void setHost(String host) {
        MailUtil.host = host;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        MailUtil.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        MailUtil.password = password;
    }
}

package com.jimmy.springBootDemo.config.basic;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * author : jimmyLJM on 2017-09-08
 * 自动配置属性读取类
 */
@Component
@ConfigurationProperties(prefix="myProps") //接收application.yml中的myProps下面的属性
public class Myprops {

    private String adminPath;   //


    public String getAdminPath() {
        return adminPath;
    }

    public void setAdminPath(String adminPath) {
        this.adminPath = adminPath;
    }
}

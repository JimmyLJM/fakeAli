package com.prc.desiners.代理模式.demo;

/**
 *  真实主题
 *    提供具体业务逻辑实现
 */
public class RealSubject implements Subject{

    @Override
    public void Request() {
        System.out.println("访问真实主题方法...");
    }
}

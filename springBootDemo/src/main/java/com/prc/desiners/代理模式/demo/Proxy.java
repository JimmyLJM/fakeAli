package com.prc.desiners.代理模式.demo;

/**
 * 代理类
 *  代理真实协议
 *      持有真是协议对象，实现具体方法调用真实主题的实现方法
 *
 *      在实现具体方法前可以调用做一些预加工、后加工
 */
public class Proxy implements Subject{

    private RealSubject realSubject;

    public void Request() {
        if (realSubject==null) {
            realSubject=new RealSubject();
        }
        preRequest();
        realSubject.Request();
        postRequest();
    }


    public void preRequest() {
        System.out.println("访问真实主题之前的预处理。");
    }

    public void postRequest(){
        System.out.println("访问真实主题之后的后续处理。");
    }
}

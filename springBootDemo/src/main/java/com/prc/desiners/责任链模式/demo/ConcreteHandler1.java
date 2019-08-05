package com.prc.desiners.责任链模式.demo;

public class ConcreteHandler1 extends Handler{

    // 重写处理请求方法
    public void handleRequest(String request) {

        if(request.equals("one")) {
            System.out.println("具体处理者1负责处理该请求！");
        } else {
            if(getNext()!=null) {
                getNext().handleRequest(request);
            } else {
                System.out.println("没有人处理该请求！");
            }
        }
    }
}

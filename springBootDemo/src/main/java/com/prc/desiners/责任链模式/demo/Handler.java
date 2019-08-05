package com.prc.desiners.责任链模式.demo;

public abstract class Handler {

    private Handler next;   // 持有责任链中的下一个元素

    public void setNext(Handler next) {
        this.next=next;
    }

    public Handler getNext() {
        return next;
    }

    //处理请求的方法
    public abstract void handleRequest(String request);
}

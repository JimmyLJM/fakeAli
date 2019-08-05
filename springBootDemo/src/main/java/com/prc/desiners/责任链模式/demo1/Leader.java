package com.prc.desiners.责任链模式.demo1;

public abstract class Leader {

    private Leader next;

    public void setNext(Leader next) {
        this.next=next;
    }

    public Leader getNext() {
        return next;
    }

    //处理请求的方法
    public abstract void handleRequest(int LeaveDays);

}

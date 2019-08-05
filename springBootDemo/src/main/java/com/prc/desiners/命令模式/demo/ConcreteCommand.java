package com.prc.desiners.命令模式.demo;

/**
 * 命令实现
 */
public class ConcreteCommand implements Command{

    // 接收者成员变量
    private Receiver receiver;

    ConcreteCommand() {
        receiver=new Receiver();
    }

    public void execute() {
        receiver.action();
    }
}

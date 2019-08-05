package com.prc.desiners.状态模式.demo;

public class ConcreteStateB extends State{

    public void Handle(Context context) {
        System.out.println("当前状态是 B.");
        context.setState(new ConcreteStateA());
    }
}

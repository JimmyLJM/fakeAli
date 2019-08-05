package com.prc.desiners.装饰模式.demo;

/**
 * 具体构件
 */
public class ConcreteComponent implements Component{

    public ConcreteComponent() {
        System.out.println("创建具体构件角色");
    }

    public void operation() {
        System.out.println("调用具体构件角色的方法operation()");
    }
}

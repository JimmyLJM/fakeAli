package com.prc.desiners.装饰模式.demo;

/**
 * 实现同一个接口来同一多态
 *
 */
public class Test {

    public static void main(String[] args)  {
        Component p = new ConcreteComponent();
        p.operation();
        System.out.println("---------------------------------");
        Component d = new ConcreteDecorator(p);
        d.operation();
    }
}

package com.prc.desiners.适配器模式.类适配器;

/**
 * Adaptee类并没有method2()方法，而客户端则期待这个方法。
 * 为使客户端能够使用Adaptee类，我们把Adaptee与Target衔接起来。
 * Adapter与Adaptee是继承关系，这决定了这是一个类适配器模式。
 */
public class Adapter extends Adaptee implements Target{

    @Override
    public void method2() {
        System.out.println("method 2");
    }
}

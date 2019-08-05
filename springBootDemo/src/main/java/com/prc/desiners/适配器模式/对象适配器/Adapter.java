package com.prc.desiners.适配器模式.对象适配器;

/**
 * 适配器
 *  持有源的对象
 *  对象适配器
 */
public class Adapter implements Target{

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void method1() {
        adaptee.method1();
    }

    @Override
    public void method2() {
        System.out.println("method 2");
    }
}

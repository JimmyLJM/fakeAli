package com.prc.desiners.适配器模式.对象适配器;


public class Test {
    public static void main(String[] args) {
        Adapter adapter = new Adapter(new Adaptee());
        adapter.method1();
        adapter.method2();
    }
}

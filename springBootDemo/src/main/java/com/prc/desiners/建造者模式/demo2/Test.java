package com.prc.desiners.建造者模式.demo2;

/**
 * demo2 测试
 *
 * 1、创建建造者定义
 * 2、创建建造者实现具体产品
 * 3、随意搭配
 */
public class Test {

    public static void main(String[] args) {
        ConcreatBuilder concreteBuilder = new ConcreatBuilder();
        Product build = concreteBuilder
                .bulidA("牛肉煲")
//              .bulidC("全家桶")
                .bulidD("冰淇淋")
                .build();
        System.out.println(build.toString());
    }
}

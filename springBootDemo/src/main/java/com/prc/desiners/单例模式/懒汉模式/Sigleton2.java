package com.prc.desiners.单例模式.懒汉模式;

/**
 * 懒汉模式
 * 把构造器改为私有的，这样能够防止被外部的类调用
 * 无法保证多线程情况下创建多个对象
 * verson 1.1
 */
public class Sigleton2 {
    private static Sigleton2 instance;
    private Sigleton2() {}
    public static Sigleton2 getInstance() {
        if (instance == null) {
            instance = new Sigleton2();
        }
        return instance;
    }
}

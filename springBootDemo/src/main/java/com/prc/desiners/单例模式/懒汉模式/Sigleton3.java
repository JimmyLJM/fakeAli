package com.prc.desiners.单例模式.懒汉模式;

/**
 * 懒汉模式
 * 针对多线程的场景，增加 synchronized来给  getInstance方法加锁
 * 问题在于若过多的线程请求则会导致线程处于等待
 * verson 1.2
 */
public class Sigleton3 {
    private static Sigleton3 instance;
    private Sigleton3() {}
    public static synchronized Sigleton3 getInstance() {
        if (instance == null) {
            instance = new Sigleton3();
        }
        return instance;
    }
}

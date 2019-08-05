package com.prc.desiners.单例模式.懒汉模式;

/**
 * 懒汉模式：verson 1.4
 *
 *  解决verson1.3 非原子操作引起的问题
 *  需要给instance的声明加上volatile关键字即可
 *
 *   volatile关键字的一个作用是禁止指令重排
 */
public class Sigleton5 {
    private static volatile Sigleton5 instance;
    private Sigleton5() {}
    public static Sigleton5 getInstance() {
        if (instance == null) {
            synchronized (Sigleton5.class) {
                if (instance == null) {
                    instance = new Sigleton5();
                }
            }
        }
        return instance;
    }
}

package com.prc.desiners.单例模式.懒汉模式;

/**
 *  懒汉模式单例 ：指全局的单例实例在第一次被使用时构建
 *  verson 1.0
 */
public class Sigleton1 {

    private static Sigleton1 instance;
    public static Sigleton1 getInstance() {
        if (instance == null) {
            instance = new Sigleton1();
        }
        return instance;
    }

}

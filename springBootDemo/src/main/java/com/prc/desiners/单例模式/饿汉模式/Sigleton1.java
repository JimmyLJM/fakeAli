package com.prc.desiners.单例模式.饿汉模式;

/**
 * 饿汉模式： 全局的单例实例在类装载时构建
 *
 *  不严格的说，大致有这么几个条件会触发一个类被加载：
 *  1. new一个对象时
 *  2. 使用反射创建它的实例时
 *  3. 子类被加载时，如果父类还没被加载，就先加载父类
 *  4. jvm启动时执行的主类会首先被加载
 *  5. 一些其他的实现方式(静态内部类、枚举)
 *
 * verson 1.0
 */
public class Sigleton1 {
    private static final Sigleton1 INSTANCE = new Sigleton1();
    private Sigleton1() {}
    public static Sigleton1 getInstance() {
        return INSTANCE;
    }
}

package com.prc.desiners.单例模式.懒汉模式;

/**
 * 懒汉模式：  verson 1.3
 * 双重检查（Double-Check）
 *
 * 第一个if (instance == null)，其实是为了解决效率问题，
 * 只有instance为null的时候，才进入synchronized的代码段——大大减少了几率。
 *
 * 第二个if (instance == null)是为了防止可能出现多个实例的情况
 *
 *
 *  但仍然存在问题
 *  在于singleton = new Singleton()这句，这并非是一个原子操作，事实上在 JVM 中这句话大概做了下面 3 件事情。
 *  1. 给 singleton 分配内存
 *  2. 调用 Singleton 的构造函数来初始化成员变量，形成实例
 *  3. 将singleton对象指向分配的内存空间（执行完这步 singleton才是非 null 了）
 *
 *  非原子操作无法保证2、3步的执行顺序，
 *  由于有一个『instance已经不为null但是仍没有完成初始化』的中间状态，而这个时候，
 *  如果有其他线程刚好运行到第一层if (instance == null)这里，
 *  这里读取到的instance已经不为null了，所以就直接把这个中间状态的instance拿去用了，就会产生问题
 */
public class Sigleton4 {
    private static Sigleton4 instance;
    private Sigleton4() {}
    public static Sigleton4 getInstance() {
        if (instance == null) {
            synchronized (Sigleton4.class) {
                if (instance == null) {
                    instance = new Sigleton4();
                }
            }
        }
        return instance;
    }
}

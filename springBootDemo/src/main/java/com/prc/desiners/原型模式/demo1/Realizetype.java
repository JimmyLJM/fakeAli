package com.prc.desiners.原型模式.demo1;

/**
 * 原型类
 *
 * 浅克隆
 */
public class Realizetype implements Cloneable{

    Realizetype() {
        System.out.println("具体原型创建成功！");
    }
    public Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (Realizetype)super.clone();
    }
}

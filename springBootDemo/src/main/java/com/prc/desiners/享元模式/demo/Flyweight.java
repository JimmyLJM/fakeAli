package com.prc.desiners.享元模式.demo;

/**
 * 抽象享元角色
 */
public interface Flyweight {
    public void operation(UnsharedConcreteFlyweight state);
}

package com.prc.desiners.迭代器模式.demo;

/**
 * 抽象迭代
 */
public interface Iterator {

    Object first();
    Object next();
    boolean hasNext();
}

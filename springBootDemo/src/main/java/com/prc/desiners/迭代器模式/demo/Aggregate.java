package com.prc.desiners.迭代器模式.demo;

/**
 *  抽象聚合类
 *
 */
public interface Aggregate {

    public void add(Object obj);
    public void remove(Object obj);
    public Iterator getIterator();
}

package com.prc.desiners.迭代器模式.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体聚合
 *      提供获取迭代类的方法，方法中将需迭代的数据传递给迭代类
 */
public class ConcreteAggregate implements Aggregate {

    private List<Object> list = new ArrayList<Object>();

    public void add(Object obj) {
        list.add(obj);
    }

    public void remove(Object obj) {
        list.remove(obj);
    }

    public Iterator getIterator() {
        return (new ConcreteIterator(list));
    }
}

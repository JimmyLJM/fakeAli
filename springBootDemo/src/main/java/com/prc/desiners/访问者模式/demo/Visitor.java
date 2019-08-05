package com.prc.desiners.访问者模式.demo;

// 抽象访问者
public interface Visitor {
    void visit(ConcreteElementA element);
    void visit(ConcreteElementB element);
}

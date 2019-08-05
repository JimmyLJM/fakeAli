package com.prc.desiners.策略模式.demo1;

/**
 * 具体策略类A
 */
public class ConcreteStrategyA implements Strategy{

    @Override
    public void strategyMethod() {
        System.out.println("具体策略A的策略方法被访问！");
    }
}

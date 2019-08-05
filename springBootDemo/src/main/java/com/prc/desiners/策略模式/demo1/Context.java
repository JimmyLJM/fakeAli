package com.prc.desiners.策略模式.demo1;

/**
 * 环境类
 */
public class Context {

    // 持有策略实例
    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy=strategy;
    }
    public void strategyMethod() {
        strategy.strategyMethod();
    }
}

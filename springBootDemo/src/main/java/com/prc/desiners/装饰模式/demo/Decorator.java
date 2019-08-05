package com.prc.desiners.装饰模式.demo;

/**
 * 抽象装饰角色
 */
public class Decorator implements Component{

    private Component component;

    public Decorator(Component component) {
        this.component=component;
    }

    public void operation() {
        component.operation();
    }
}

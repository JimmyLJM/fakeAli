package com.prc.desiners.组合模式.demo1;

/**
 * demo1
 * 透明模式
 *   抽象构件 Component 定义行为
 */
public interface Component {

    public void add(Component c);
    public void remove(Component c);
    public Component getChild(int i);
    public void operation();
}

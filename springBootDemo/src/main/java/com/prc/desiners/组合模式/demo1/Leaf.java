package com.prc.desiners.组合模式.demo1;

/**
 * demo1
 * 透明模式
 *      树叶构件 leaf
 *      实现抽象构建的所有行为方法
 *
 *      叶子节点 可理解为文件
 */
public class Leaf implements Component{

    private String name;

    public Leaf(String name){
        this.name=name;
    }

    public void add(Component c){ }

    public void remove(Component c){ }

    public Component getChild(int i){
        return null;
    }

    public void operation() {
        System.out.println("树叶"+name+"：被访问！");
    }
}

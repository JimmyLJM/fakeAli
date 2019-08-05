package com.prc.desiners.组合模式.demo2;

/**
 * 叶子节点
 */
public class Leaf implements Component{

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void Display(){
        System.out.println("树叶"+name+"：被访问！");
    }

}

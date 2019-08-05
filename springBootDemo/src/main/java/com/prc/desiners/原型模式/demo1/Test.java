package com.prc.desiners.原型模式.demo1;

public class Test {

    public static void main(String[] args)throws CloneNotSupportedException {
        Realizetype obj1=new Realizetype();
        Realizetype obj2=(Realizetype)obj1.clone();
        System.out.println("obj1==obj2?"+(obj1==obj2));
    }
}

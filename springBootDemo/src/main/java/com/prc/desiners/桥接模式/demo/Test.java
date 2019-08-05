package com.prc.desiners.桥接模式.demo;

public class Test {

    public static void main(String[] args) {
        Implementor imple=new ConcreteImplementorA();
        Abstraction abs=new RefinedAbstraction(imple);
        abs.Operation();
    }
}

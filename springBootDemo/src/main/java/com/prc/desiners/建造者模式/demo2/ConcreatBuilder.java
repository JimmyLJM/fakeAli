package com.prc.desiners.建造者模式.demo2;

public class ConcreatBuilder implements Builder{

    private Product product;

    public ConcreatBuilder() {
        product = new Product();
    }

    @Override
    public Product build() {
        return product;
    }

    @Override
    public Builder bulidA(String mes) {
        product.setBuildA(mes);
        return this;
    }

    @Override
    public Builder bulidB(String mes) {
        product.setBuildB(mes);
        return this;
    }

    @Override
    public Builder bulidC(String mes) {
        product.setBuildC(mes);
        return this;
    }

    @Override
    public Builder bulidD(String mes) {
        product.setBuildD(mes);
        return this;
    }
}

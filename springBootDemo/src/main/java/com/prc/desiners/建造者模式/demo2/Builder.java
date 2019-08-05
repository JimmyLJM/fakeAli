package com.prc.desiners.建造者模式.demo2;

/**
 * 方式二
 *
 */
public interface Builder {

    //汉堡
    Builder bulidA(String mes);
    //饮料
    Builder bulidB(String mes);
    //薯条
    Builder bulidC(String mes);
    //甜品
    Builder bulidD(String mes);
    //获取套餐
    Product build();
}

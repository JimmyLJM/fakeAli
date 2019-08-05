package com.prc.desiners.工厂模式.简单工厂;

import com.prc.desiners.工厂模式.产品1.BibiPhone;
import com.prc.desiners.工厂模式.产品1.Computer;
import com.prc.desiners.工厂模式.产品1.Phone;
import com.prc.desiners.工厂模式.产品1.Produce;

/**
 * 简单工厂：
 * verson 1.0
 *
 */
public class FactoryTest {

    public static final int TYPE_C = 1;   // computer
    public static final int TYPE_P = 2;   // phone
    public static final int TYPE_BBP = 3; // bbPhone

    public static Produce gainPro(int proType){

        switch (proType) {
            case TYPE_BBP:
                return new BibiPhone();
            case TYPE_P:
                return new Phone();
            case TYPE_C:
                return new Computer();
            default:
                return new Computer();
        }
    }

    public static void main(String[] args) {
        Produce pro = FactoryTest.gainPro(1);
        pro.doSomthing();
    }
}

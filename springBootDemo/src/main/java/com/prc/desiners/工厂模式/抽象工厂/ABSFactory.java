package com.prc.desiners.工厂模式.抽象工厂;

import com.prc.desiners.工厂模式.产品1.Produce;
import com.prc.desiners.工厂模式.产品2.Meat;

/**
 * 抽象工厂：
 * 抽象工厂就是一个工厂不单生产一个种类的产品，而是生产多个种类的产品，也就是生产相关产品的产品家族。
 */
public interface ABSFactory {
    public Produce carfactory();
    public Meat planefactory();

}

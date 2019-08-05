package com.prc.desiners.组合模式.demo2;

/**
 * demo2
 *   安全式
 *      抽象构件，声明一个接口用于访问和管理Component的子部件
 */
public interface Component {

    /// <summary>
    /// 显示层级结构
    public abstract void Display();
}

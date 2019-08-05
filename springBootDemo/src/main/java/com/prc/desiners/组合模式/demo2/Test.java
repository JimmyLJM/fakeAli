package com.prc.desiners.组合模式.demo2;

import com.prc.desiners.组合模式.demo2.Component;
import com.prc.desiners.组合模式.demo2.Composite;
import com.prc.desiners.组合模式.demo2.Leaf;

public class Test {

    public static void main(String[] args) {
        // 树枝、叶子初始化
        Composite c0 = new Composite();           // 最顶端的文件夹
        Composite c1 = new Composite();           // 次级文件夹
        Component leaf1=new Leaf("小黄人");   // 文件1
        Component leaf2=new Leaf("小黄狗");   // 文件2
        Component leaf3=new Leaf("阿黄");   // 文件3

        // 树枝上添加叶子、树枝上添加树枝
        c0.add(leaf1);
        c0.add(c1);
        c1.add(leaf2);
        c1.add(leaf3);

        // 调用树枝操作
        c0.Display();
    }
}

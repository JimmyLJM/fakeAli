package com.prc.desiners.原型模式.demo2;

/**
 * 浅克隆实际使用例子
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Citation obj1=new Citation("张三","同学：在2016学年第一学期中表现优秀，被评为三好学生。","韶关学院");
        obj1.display();
        Citation obj2=(Citation) obj1.clone();  // 复制对象信息
        obj2.setName("李四");                    // 修改复制的对象信息
        obj2.display();
    }
}

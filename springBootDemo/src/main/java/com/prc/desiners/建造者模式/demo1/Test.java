package com.prc.desiners.建造者模式.demo1;


import com.alibaba.fastjson.JSONObject;

/**
 * 测试类demo1
 *
 *   常规角色的建造者模式
 *   通过指挥者调用  继承了抽象建造者的建造者创建产品
 *
 *   1、创建抽象建造者定义生产产品的步骤
 *   2、创建建造者具体实现生产产品步骤
 *   3、创建指挥者指挥建造者生产产品
 *   4、完成生产
 */
public class Test {
    public static void main(String[] args) {

        // 获取实际建造者
        CourseBuild courseBuild= new CourseActualBuilder();
        // 创建指挥者
        CourseDirector director = new CourseDirector();

        // 将创建者实例给指挥者使用
        director.setCourseBuilder(courseBuild);

        // 通过指挥者调用
        Course course = director.makeCourse("Java设计模式",
                "Java设计模式PPT",
                "Java设计模式视频",
                "Java设计模式手记",
                "Java设计模式问答");

        System.out.println(JSONObject.toJSONString(course));
    }
}

package com.prc.desiners.建造者模式.demo1;

/**
 *  建造者模式
 *  demo1
 *
 *  Builder角色（抽象建造者）：提供一套制作产品的标准信息
 */
public interface CourseBuild {

    public void buildCourseName(String courseName);
    public void buildCoursePPT(String coursePPT);
    public void buildCourseVideo(String courseVideo);
    public void buildCourseArticle(String courseArticle);
    public void buildCourseQA(String courseQA);

    //上面的都属于课程的组件，这个方法时课程的建造
    public Course makeCourse();
}

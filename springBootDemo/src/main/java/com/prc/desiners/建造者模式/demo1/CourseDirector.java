package com.prc.desiners.建造者模式.demo1;

/**
 * Director(指挥者):安排复杂对象的建造次序
 */
public class CourseDirector {

    // 持有建造者
    private CourseBuild courseBuild;

    //通过set注入，传入的课程建造的值
    public void setCourseBuilder(CourseBuild courseBuild) {
        this.courseBuild = courseBuild;
    }

    public Course makeCourse(String courseName,
                             String coursePPT,
                             String courseVideo,
                             String courseArticle,
                             String courseQA) {
        this.courseBuild.buildCourseName(courseName);
        this.courseBuild.buildCoursePPT(coursePPT);
        this.courseBuild.buildCourseArticle(courseArticle);
        this.courseBuild.buildCourseVideo(courseVideo);
        this.courseBuild.buildCourseQA(courseQA);
        return this.courseBuild.makeCourse();
    }
}

package com.xha.principles.dependence;

/**
 * 依赖应用程序
 *
 * @author Xu huaiang
 * @date 2023/07/12
 */
public class DependenceApplication {
    public static void main(String[] args) {
        Student student = new Student();
        student.courseStudy(new Chinese());
        student.courseStudy(new Math());
    }
}

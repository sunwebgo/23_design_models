package com.xha.model.behaviour.iterator;

/**
 * 抽象容器类
 *
 * @author Xu huaiang
 * @date 2023/07/15
 */
public interface StudentAggregate {
    void addStudent(Student student);

    void removeStudent(Student student);

    StudentIterator getStudentIterator();

}

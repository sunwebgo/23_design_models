package com.xha.patterns.behaviour.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体容器类
 *
 * @author Xu huaiang
 * @date 2023/07/15
 */
public class StudentAggregateImpl implements StudentAggregate{
    private List<Student> list = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        list.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        list.remove(student);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list);
    }
}

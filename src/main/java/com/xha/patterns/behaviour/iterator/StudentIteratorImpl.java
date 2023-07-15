package com.xha.patterns.behaviour.iterator;

import java.util.List;

/**
 * 具体迭代器
 *
 * @author Xu huaiang
 * @date 2023/07/15
 */
public class StudentIteratorImpl implements StudentIterator{
    private List<Student> list;
    private int position = 0;

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        Student student = list.get(position);
        position++;
        return student;
    }
}

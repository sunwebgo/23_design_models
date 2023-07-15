package com.xha.patterns.behaviour.iterator;


/**
 * 抽象迭代器
 *
 * @author Xu huaiang
 * @date 2023/07/15
 */
public interface StudentIterator {
    boolean hasNext();

    Student next();
}

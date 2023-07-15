package com.xha.patterns.behaviour.vistor;

/**
 * 抽象访问者
 *
 * @author Xu huaiang
 * @date 2023/07/15
 */
public interface Person {

    void feed(Dog dog);

    void feed(Cat cat);
}

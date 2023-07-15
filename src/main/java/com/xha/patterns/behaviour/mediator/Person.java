package com.xha.patterns.behaviour.mediator;

/**
 * 抽象同事类
 *
 * @author Xu huaiang
 * @date 2023/07/15
 */
public abstract class Person {
    protected String name;
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}

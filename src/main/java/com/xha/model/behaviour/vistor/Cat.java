package com.xha.model.behaviour.vistor;

/**
 * 具体元素类
 *
 * @author Xu huaiang
 * @date 2023/07/15
 */
public class Cat implements Animal{
    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("好好吃，喵喵喵");
    }
}

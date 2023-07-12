package com.xha.principles.interfaceSegregation;

/**
 * 布谷鸟
 *
 * @author Xu huaiang
 * @date 2023/07/12
 */
public class Cuckoo implements Bird {

    @Override
    public void fly() {
        System.out.println("布谷鸟飞行");
    }

    @Override
    public void eat() {
        System.out.println("布谷鸟吃虫子");
    }
}

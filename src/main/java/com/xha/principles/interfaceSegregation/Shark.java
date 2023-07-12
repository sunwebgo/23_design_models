package com.xha.principles.interfaceSegregation;

/**
 * 鲨鱼
 *
 * @author Xu huaiang
 * @date 2023/07/12
 */
public class Shark implements Fish {

    @Override
    public void swim() {
        System.out.println("鲨鱼游泳");
    }

    @Override
    public void eat() {
        System.out.println("鲨鱼吃肉");
    }
}

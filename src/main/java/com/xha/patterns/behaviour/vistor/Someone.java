package com.xha.patterns.behaviour.vistor;

/**
 * 具体访问者
 *
 * @author Xu huaiang
 * @date 2023/07/15
 */
public class Someone implements Person{
    @Override
    public void feed(Dog dog) {
        System.out.println("其他人喂食狗");
    }

    @Override
    public void feed(Cat cat) {
        System.out.println("其他人喂食猫");
    }
}

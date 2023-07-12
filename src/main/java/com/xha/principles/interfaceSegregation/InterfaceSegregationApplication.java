package com.xha.principles.interfaceSegregation;

/**
 * 接口隔离应用程序
 *
 * @author Xu huaiang
 * @date 2023/07/12
 */
public class InterfaceSegregationApplication {
    public static void main(String[] args) {
        Bird bird = new Cuckoo();
        bird.eat();
        bird.fly();
        Fish fish = new Shark();
        fish.eat();
        fish.swim();
    }
}

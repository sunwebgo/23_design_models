package com.xha.model.creater.factory.simple_factory_config;

/**
 * 测试演示
 *
 * @author Xu huaiang
 * @date 2023/07/13
 */
public class TestDemo {
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.createCoffee("american");
        System.out.println(coffee.getName());
        System.out.println("==============");
        coffee = CoffeeFactory.createCoffee("lattee");
        System.out.println(coffee.getName());
    }
}

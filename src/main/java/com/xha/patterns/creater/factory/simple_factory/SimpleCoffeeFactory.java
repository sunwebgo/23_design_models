package com.xha.patterns.creater.factory.simple_factory;

/**
 * 简单咖啡工厂
 *
 * @author Xu huaiang
 * @date 2023/07/12
 */
public class SimpleCoffeeFactory {
    public static Coffee createCoffee(String type) {
        Coffee coffee = null;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("lattee".equals(type)) {
            coffee = new LateeCoffee();
        } else {
            throw new RuntimeException("没有你要的咖啡");
        }
        return coffee;
    }
}

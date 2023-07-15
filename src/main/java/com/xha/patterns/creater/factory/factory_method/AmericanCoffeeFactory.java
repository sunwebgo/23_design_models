package com.xha.patterns.creater.factory.factory_method;

/**
 * 美式咖啡工厂
 *
 * @author Xu huaiang
 * @date 2023/07/13
 */
public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}

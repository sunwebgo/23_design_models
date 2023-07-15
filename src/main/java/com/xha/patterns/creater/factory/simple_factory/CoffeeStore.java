package com.xha.patterns.creater.factory.simple_factory;

/**
 * 咖啡店
 *
 * @author Xu huaiang
 * @date 2023/07/12
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        Coffee coffee = SimpleCoffeeFactory.createCoffee(type);
        coffee.addMilk();
        coffee.addSuger();
        return coffee;
    }
}

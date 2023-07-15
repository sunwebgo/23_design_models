package com.xha.patterns.creater.factory.factory_method;

/**
 * 咖啡店
 *
 * @author Xu huaiang
 * @date 2023/07/13
 */
public class CoffeeStore {
    private CoffeeFactory coffeeFactory;

    public void setCoffeeFactory(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee(){
        Coffee coffee = coffeeFactory.createCoffee();
        coffee.addMilk();
        coffee.addSuger();
        return coffee;
    }
}

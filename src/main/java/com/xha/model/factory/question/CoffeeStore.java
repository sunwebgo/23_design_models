package com.xha.model.factory.question;

/**
 * 咖啡店
 *
 * @author Xu huaiang
 * @date 2023/07/12
 */
public class CoffeeStore {
     public Coffee orderCoffee(String type) {
        Coffee coffee = null;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("不支持的咖啡类型");
        }
        coffee.addSuger();
        coffee.addMilk();
        return coffee;
    }
}

package com.xha.model.creater.factory.factory_method;

/**
 * 测试演示
 *
 * @author Xu huaiang
 * @date 2023/07/13
 */
public class TestDemo {
    public static void main(String[] args) {
//        创建咖啡店对象
        CoffeeStore coffeeStore = new CoffeeStore();
//        设置咖啡工厂对象
        coffeeStore.setCoffeeFactory(new AmericanCoffeeFactory());
//        下单
        Coffee coffee = coffeeStore.orderCoffee();
        System.out.println(coffee.getName());
    }
}

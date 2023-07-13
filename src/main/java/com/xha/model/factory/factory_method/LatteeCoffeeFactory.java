package com.xha.model.factory.factory_method;

/**
 * 拿铁咖啡工厂
 *
 * @author Xu huaiang
 * @date 2023/07/13
 */
public class LatteeCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteeCoffee();
    }
}

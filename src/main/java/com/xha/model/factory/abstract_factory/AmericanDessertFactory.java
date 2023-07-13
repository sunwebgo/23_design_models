package com.xha.model.factory.abstract_factory;

/**
 * 美国甜点工厂
 *
 * @author Xu huaiang
 * @date 2023/07/13
 */
public class AmericanDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMouse();
    }
}

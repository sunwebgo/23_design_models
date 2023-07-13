package com.xha.model.creater.factory.abstract_factory;

/**
 * 意大利甜点工厂
 *
 * @author Xu huaiang
 * @date 2023/07/13
 */
public class ItalyDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteeCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Trimisu();
    }
}

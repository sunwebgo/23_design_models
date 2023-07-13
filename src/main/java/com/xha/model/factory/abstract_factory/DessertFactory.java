package com.xha.model.factory.abstract_factory;

/**
 * 甜点工厂
 *
 * @author Xu huaiang
 * @date 2023/07/13
 */
public interface DessertFactory {
    /**
     * 生产咖啡
     *
     * @return 咖啡
     */
    Coffee createCoffee();

    /**
     * 生产甜点
     *
     * @return 甜点
     */
    Dessert createDessert();
}

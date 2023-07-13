package com.xha.model.creater.factory.factory_method;

/**
 * 咖啡工厂
 *
 * @author Xu huaiang
 * @date 2023/07/13
 */
public interface CoffeeFactory {
    /**
     * 生产咖啡
     *
     * @return {@link Coffee}
     */
    Coffee createCoffee();
}

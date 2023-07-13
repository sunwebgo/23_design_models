package com.xha.model.factory.abstract_factory;

/**
 * 咖啡
 *
 * @author Xu huaiang
 * @date 2023/07/13
 */
public abstract class Coffee {
    public abstract String getName();

    public void addMilk() {
        System.out.println("加奶");
    }

    public void addSuger() {
        System.out.println("加糖");
    }
}

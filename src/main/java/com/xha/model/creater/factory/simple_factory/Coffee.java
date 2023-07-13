package com.xha.model.creater.factory.simple_factory;

/**
 * 咖啡
 *
 * @author Xu huaiang
 * @date 2023/07/12
 */
public abstract class Coffee {
    public abstract String getName();

    public void addSuger() {
        System.out.println("加糖");
    }

    public void addMilk() {
        System.out.println("加奶");
    }

}

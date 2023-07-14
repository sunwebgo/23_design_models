package com.xha.model.behaviour.template;

/**
 * 具体子类
 *
 * @author Xu huaiang
 * @date 2023/07/14
 */
public class ConcreteClass_Doufu extends AbstractClass {
    @Override
    public void pourVegetable() {
        System.out.println("倒豆腐");
    }

    @Override
    public void pourSauce() {
        System.out.println("倒酱油");
    }
}

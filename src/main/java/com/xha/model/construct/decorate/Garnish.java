package com.xha.model.construct.decorate;

/**
 * 抽象装饰者
 *
 * @author Xu huaiang
 * @date 2023/07/14
 */
public abstract class Garnish extends FastFood{
//    声明快餐类的引用
    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(float price, String desc, FastFood fastFood) {
        super(price, desc);
        this.fastFood = fastFood;
    }
}

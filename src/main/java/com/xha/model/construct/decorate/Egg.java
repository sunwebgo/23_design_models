package com.xha.model.construct.decorate;

/**
 * 具体装饰者
 *
 * @author Xu huaiang
 * @date 2023/07/14
 */
public class Egg extends Garnish {

    public Egg(FastFood fastFood) {
        super(1, "鸡蛋", fastFood);
    }

    @Override
    public float cost() {
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}

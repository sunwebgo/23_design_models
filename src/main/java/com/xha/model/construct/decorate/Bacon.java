package com.xha.model.construct.decorate;

/**
 * 具体装饰者
 *
 * @author Xu huaiang
 * @date 2023/07/14
 */
public class Bacon extends Garnish {

    public Bacon(FastFood fastFood) {
        super(1, "培根", fastFood);
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

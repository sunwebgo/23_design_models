package com.xha.patterns.construct.decorate;

/**
 * 具体组件
 *
 * @author Xu huaiang
 * @date 2023/07/14
 */
public class FriedRice extends FastFood{
    public FriedRice() {
        super(10,"炒饭");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}

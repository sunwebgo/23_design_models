package com.xha.model.construct.decorate;

/**
 * 具体组件
 *
 * @author Xu huaiang
 * @date 2023/07/14
 */
public class FriedNoodle extends FastFood{
    public FriedNoodle() {
        super(12,"炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}

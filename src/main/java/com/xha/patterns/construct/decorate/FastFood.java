package com.xha.patterns.construct.decorate;

/**
 * 快餐（抽象组件）
 *
 * @author Xu huaiang
 * @date 2023/07/14
 */
public abstract class FastFood {
    private float price;
    private String desc;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public FastFood() {
    }

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public abstract float cost();
}

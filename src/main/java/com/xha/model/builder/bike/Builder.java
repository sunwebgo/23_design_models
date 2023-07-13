package com.xha.model.builder.bike;

/**
 * 构建器
 *
 * @author Xu huaiang
 * @date 2023/07/13
 */
public abstract class Builder {

    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike createBike();
}

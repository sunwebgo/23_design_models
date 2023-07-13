package com.xha.model.creater.builder.bike;

/**
 * 建造者模式
 *
 * @author Xu huaiang
 * @date 2023/07/13
 */
public class Director {
//    1.创建指挥者对象
    private Builder builder;

//    2.构造器传入具体建造者
    public Director(Builder builder) {
        this.builder = builder;
    }

//    3.指挥者指挥建造者建造对象
    public Bike construct(){
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}

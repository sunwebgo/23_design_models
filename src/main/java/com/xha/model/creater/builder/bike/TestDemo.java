package com.xha.model.creater.builder.bike;

/**
 * 测试演示
 *
 * @author Xu huaiang
 * @date 2023/07/13
 */
public class TestDemo {
    public static void main(String[] args) {
//        1.创建指挥者对象
        Director director = new Director(new MobileBuilder());
//        2.指挥者指挥建造者建造对象
        Bike bike = director.construct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}

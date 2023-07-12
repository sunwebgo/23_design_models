package com.xha.principles.compositereuse;

/**
 * 组合重用应用程序
 *
 * @author Xu huaiang
 * @date 2023/07/12
 */
public class CompositeReuseApplication {
    public static void main(String[] args) {
        Engine engine = new Engine("2.0升LSY直列四缸涡轮");
        Car car = new Car("凯迪拉克CT5", engine);
        car.getCar();
        System.out.println("更换引擎");
        engine = new Engine("6.2升V8机械增压引擎");
        car = new Car("凯迪拉克CT5", engine);
        car.getCar();
    }
}

package com.xha.principles.compositereuse;

/**
 * 车
 *
 * @author Xu huaiang
 * @date 2023/07/12
 */
public class Car {
    private String name;

    private Engine engine;

    public Car(String name, Engine engine) {
        this.name = name;
        this.engine = engine;
    }

    public void getCar(){
        System.out.println("车名："+name+" 引擎："+engine.getName());
    }
}

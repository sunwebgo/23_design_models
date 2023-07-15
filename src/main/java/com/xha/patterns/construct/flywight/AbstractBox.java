package com.xha.patterns.construct.flywight;

/**
 * 抽象享元角色
 *
 * @author Xu huaiang
 * @date 2023/07/14
 */
public abstract class AbstractBox {
    public abstract String getShape();

    public void display(String color){
        System.out.println("形状："+this.getShape()+"，颜色："+color);
    }
}

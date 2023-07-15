package com.xha.patterns.behaviour.mediator;

/**
 * 抽象同事类
 *
 * @author Xu huaiang
 * @date 2023/07/15
 */
public class HouseOwner extends Person {
    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void constact(String message){
        mediator.constact(message, this);
    }

    public void getMessage(String message){
        System.out.println("房主:" + name + ",获得信息：" + message);
    }
}

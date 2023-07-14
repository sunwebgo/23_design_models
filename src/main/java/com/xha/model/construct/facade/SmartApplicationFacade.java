package com.xha.model.construct.facade;

/**
 * 智能应用程序外观
 *
 * @author Xu huaiang
 * @date 2023/07/14
 */
public class SmartApplicationFacade {

    private Light light;

    private TV tv;

    private AirCondition airCondition;

    public SmartApplicationFacade() {
        this.light = new Light();
        this.tv = new TV();
        this.airCondition = new AirCondition();
    }

    public void say(String message) {
        if (message.equals("打开")) {
            open();
        } else if (message.equals("关闭")) {
            close();
        } else {
            System.out.println("我听不懂你在说什么");
        }
    }

    private void open() {
        light.on();
        tv.on();
        airCondition.on();
    }

    private void close() {
        light.off();
        tv.off();
        airCondition.off();
    }
}

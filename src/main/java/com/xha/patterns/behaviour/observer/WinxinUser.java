package com.xha.patterns.behaviour.observer;

/**
 * 具体观察者
 *
 * @author Xu huaiang
 * @date 2023/07/15
 */
public class WinxinUser implements Observer{
    private String name;

    public WinxinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "-" + message);
    }
}

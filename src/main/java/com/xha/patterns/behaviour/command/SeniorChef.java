package com.xha.patterns.behaviour.command;

/**
 * 接收者
 *
 * @author Xu huaiang
 * @date 2023/07/14
 */
public class SeniorChef {
    public void makeFood(String name, int num) {
        System.out.println("厨师正在做：" + name + "，数量：" + num);
    }
}

package com.xha.patterns.behaviour.template;

/**
 * 客户端
 *
 * @author Xu huaiang
 * @date 2023/07/14
 */
public class Client {
    public static void main(String[] args) {
        ConcreteClass_Baochi baochi = new ConcreteClass_Baochi();
        baochi.cookProcess();
        System.out.println("====================================");
        ConcreteClass_Doufu doufu = new ConcreteClass_Doufu();
        doufu.cookProcess();
    }
}

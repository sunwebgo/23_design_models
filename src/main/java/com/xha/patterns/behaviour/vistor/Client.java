package com.xha.patterns.behaviour.vistor;

/**
 * 客户端
 *
 * @author Xu huaiang
 * @date 2023/07/15
 */
public class Client {
    public static void main(String[] args) {
        Home home = new Home();
        home.add(new Dog());
        home.add(new Cat());
        Owner owner = new Owner();
        home.action(owner);
        System.out.println("-------------");
        Someone someone = new Someone();
        home.action(someone);
    }
}

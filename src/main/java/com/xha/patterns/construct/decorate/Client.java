package com.xha.patterns.construct.decorate;

/**
 * 客户端
 *
 * @author Xu huaiang
 * @date 2023/07/14
 */
public class Client {
    public static void main(String[] args) {
        FastFood friedRice = new FriedRice();
        System.out.println(friedRice.getDesc() + "  " + friedRice.cost());
        System.out.println("***********************");
        friedRice = new Egg(friedRice);
        System.out.println(friedRice.getDesc() + "  " + friedRice.cost());
        System.out.println("***********************");
        friedRice = new Bacon(friedRice);
        System.out.println(friedRice.getDesc() + "  " + friedRice.cost());
    }
}

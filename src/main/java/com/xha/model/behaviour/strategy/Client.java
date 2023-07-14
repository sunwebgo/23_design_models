package com.xha.model.behaviour.strategy;

/**
 * 客户端
 *
 * @author Xu huaiang
 * @date 2023/07/14
 */
public class Client {
    public static void main(String[] args) {
        SalesMan salesMan = new SalesMan(new StrategyA());
        salesMan.salesManShow();
        System.out.println("====================================");
        salesMan = new SalesMan(new StrategyB());
        salesMan.salesManShow();
        System.out.println("====================================");
        salesMan = new SalesMan(new StrategyC());
        salesMan.salesManShow();
    }
}

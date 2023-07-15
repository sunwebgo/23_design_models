package com.xha.patterns.behaviour.strategy;

/**
 * 具体策略A
 *
 * @author Xu huaiang
 * @date 2023/07/14
 */
public class StrategyA implements Strategy{
    @Override
    public void show() {
        System.out.println("买一送一");
    }
}

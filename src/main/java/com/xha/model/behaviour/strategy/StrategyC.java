package com.xha.model.behaviour.strategy;

/**
 * 具体策略C
 *
 * @author Xu huaiang
 * @date 2023/07/14
 */
public class StrategyC implements Strategy{
    @Override
    public void show() {
        System.out.println("满200减50");
    }
}

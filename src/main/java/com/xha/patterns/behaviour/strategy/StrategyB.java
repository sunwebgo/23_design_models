package com.xha.patterns.behaviour.strategy;

/**
 * 具体策略B
 *
 * @author Xu huaiang
 * @date 2023/07/14
 */
public class StrategyB implements Strategy{
    @Override
    public void show() {
        System.out.println("满100减20");
    }
}

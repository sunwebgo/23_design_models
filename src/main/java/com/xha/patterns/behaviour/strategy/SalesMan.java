package com.xha.patterns.behaviour.strategy;

/**
 * 环境类
 *
 * @author Xu huaiang
 * @date 2023/07/14
 */
public class SalesMan {
    private Strategy strategy;

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    public void salesManShow() {
        strategy.show();
    }

}

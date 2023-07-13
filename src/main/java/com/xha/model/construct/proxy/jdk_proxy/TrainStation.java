package com.xha.model.construct.proxy.jdk_proxy;

/**
 * 火车站
 *
 * @author Xu huaiang
 * @date 2023/07/13
 */
public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}

package com.xha.model.construct.proxy.static_proxy;

/**
 * 代售点
 *
 * @author Xu huaiang
 * @date 2023/07/13
 */
public class ProxyPoint implements SellTickets{

//    声明火车站对象
    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("代售点收取一些服务费用");
//        调用火车站卖票方法
        trainStation.sell();
    }
}

package com.xha.patterns.behaviour.command;

import java.util.Map;
import java.util.Set;

/**
 * 具体命令类
 *
 * @author Xu huaiang
 * @date 2023/07/14
 */
public class OrderCommand implements Command{
//    持有接收者对象
    private SeniorChef receiver;
//    持有订单对象
    private Order order;

    public OrderCommand(SeniorChef receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getDiningTable() + "号桌的订单");
        Map<String, Integer> foodDic = order.getFoodDic();
        Set<String> keys = foodDic.keySet();
        for (String key : keys) {
            receiver.makeFood(key, foodDic.get(key));
        }
        System.out.println(order.getDiningTable() + "号桌的餐做好了");
    }
}

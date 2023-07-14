package com.xha.model.behaviour.command;

/**
 * 客户端
 *
 * @author Xu huaiang
 * @date 2023/07/14
 */
public class Client {
    public static void main(String[] args) {
//        创建订单对象
        Order order1 = new Order();
        order1.setDiningTable(1);
        order1.setFood("鱼香肉丝",1);
        order1.setFood("大米",2);
        Order order2 = new Order();
        order2.setDiningTable(2);
        order2.setFood("麻婆豆腐",1);
        order2.setFood("大米",1);
//        创建厨师对象
        SeniorChef seniorChef = new SeniorChef();
//        创建命令对象
        Command command1 = new OrderCommand(seniorChef,order1);
        Command command2 = new OrderCommand(seniorChef,order2);
//        创建调用者对象
        Waiter waiter = new Waiter();
//        设置命令
        waiter.setCommand(command1);
        waiter.setCommand(command2);
//        发起请求
        waiter.orderUp();
    }
}

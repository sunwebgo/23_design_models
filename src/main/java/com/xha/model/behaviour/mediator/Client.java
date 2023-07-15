package com.xha.model.behaviour.mediator;

/**
 * 客户端
 *
 * @author Xu huaiang
 * @date 2023/07/15
 */
public class Client {
    public static void main(String[] args) {
//        1.创建中介者
        MediatorStructure mediator = new MediatorStructure();
//        2.创建租房者
        Tenant tenant = new Tenant("张三", mediator);
//        3.创建房东
        HouseOwner houseOwner = new HouseOwner("李四", mediator);

//        4.中介者介绍租房者和房东
        mediator.setTenant(tenant);
        mediator.setHouseOwner(houseOwner);

//        5.租房者发送信息给房东
        tenant.constact("我想租一套三室的房子");
//        6.房东发送信息给租房者
        houseOwner.constact("我这里有一套三室的房子，你看看");
    }
}

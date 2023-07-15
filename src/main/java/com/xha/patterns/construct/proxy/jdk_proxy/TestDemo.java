package com.xha.patterns.construct.proxy.jdk_proxy;

/**
 * 测试演示
 *
 * @author Xu huaiang
 * @date 2023/07/13
 */
public class TestDemo {
    public static void main(String[] args) {
//        1.创建火车站对象
        ProxyFactory proxyFactory = new ProxyFactory();
//        2.调用代理工厂的方法获取代理对象
        SellTickets proxyObject = proxyFactory.getProxyObject();
//        3.调用代理对象的卖票方法
        proxyObject.sell();
    }
}

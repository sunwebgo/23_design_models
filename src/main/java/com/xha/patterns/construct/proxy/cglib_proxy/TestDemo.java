package com.xha.patterns.construct.proxy.cglib_proxy;

/**
 * 测试演示
 *
 * @author Xu huaiang
 * @date 2023/07/13
 */
public class TestDemo {
    public static void main(String[] args) {
//        1.创建代理工厂对象
        ProxyFactory proxyFactory = new ProxyFactory();
//        2.调用代理工厂的方法获取代理对象，代理对象就是TrainStation的子类对象
        TrainStation proxyObject = proxyFactory.getProxyObject();
//        3.调用代理对象的卖票方法
        proxyObject.sell();
    }
}

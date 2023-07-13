package com.xha.model.construct.proxy.static_proxy;

/**
 * 测试演示
 *
 * @author Xu huaiang
 * @date 2023/07/13
 */
public class TestDemo {
    public static void main(String[] args) {
//        1.创建代售点对象
        ProxyPoint proxyPoint = new ProxyPoint();
//        2.调用代售点的卖票方法
        proxyPoint.sell();
    }
}

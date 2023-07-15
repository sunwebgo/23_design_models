package com.xha.patterns.behaviour.observer;

/**
 * 客户端
 *
 * @author Xu huaiang
 * @date 2023/07/15
 */
public class Client {
    public static void main(String[] args) {
//        创建主题
        SubscriptionSubject subject = new SubscriptionSubject();

        subject.addAttach(new WinxinUser("张三"));
        subject.addAttach(new WinxinUser("李四"));
        subject.addAttach(new WinxinUser("王五"));

//        主题更新，通知观察者
        subject.notify("内容更新");
    }
}

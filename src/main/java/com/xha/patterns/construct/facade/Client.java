package com.xha.patterns.construct.facade;

/**
 * 客户端
 *
 * @author Xu huaiang
 * @date 2023/07/14
 */
public class Client {
    public static void main(String[] args) {
        SmartApplicationFacade smart = new SmartApplicationFacade();
        smart.say("打开");
        System.out.println("--------------");
        smart.say("关闭");
    }
}

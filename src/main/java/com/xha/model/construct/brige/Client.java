package com.xha.model.construct.brige;

/**
 * 客户端
 *
 * @author Xu huaiang
 * @date 2023/07/14
 */
public class Client {
    public static void main(String[] args) {
//        1.创建一个具体的实现化角色
        OperatingSystem windows = new Windows(new AVIFile());
        windows.play("银河护卫队3");
    }
}

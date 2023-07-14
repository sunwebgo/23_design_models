package com.xha.model.construct.adapter.class_adapter;

/**
 * 客户端
 *
 * @author Xu huaiang
 * @date 2023/07/13
 */
public class   Client {
    public static void main(String[] args) {
//        1.创建计算机对象
        Computer computer = new Computer();
//        2.读取SD卡中的数据
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);
        System.out.println("============");
//        3.读取TF卡中的数据
        String msg1 = computer.readSD(new SDAdapterTF());
        System.out.println(msg1);
    }
}

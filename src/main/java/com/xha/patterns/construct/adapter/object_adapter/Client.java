package com.xha.patterns.construct.adapter.object_adapter;

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
        String SDmsg = computer.readSD(new SDCardImpl());
        System.out.println(SDmsg);
        System.out.println("============");
//        3.读取TF卡中的数据
        SDAdapterTF sdAdapterTF = new SDAdapterTF(new TFCardImpl());
        String TFmsg = computer.readSD(sdAdapterTF);
        System.out.println(TFmsg);
    }
}

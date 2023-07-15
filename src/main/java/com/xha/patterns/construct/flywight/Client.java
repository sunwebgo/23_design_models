package com.xha.patterns.construct.flywight;

/**
 * 客户端
 *
 * @author Xu huaiang
 * @date 2023/07/14
 */
public class Client {
    public static void main(String[] args) {
        BoxFactory boxFactory = BoxFactory.getInstance();
        AbstractBox LBox = boxFactory.getShape("L");
        LBox.display("红色");
        AbstractBox OBox = boxFactory.getShape("O");
        OBox.display("蓝色");
        AbstractBox IBox1 = boxFactory.getShape("I");
        IBox1.display("绿色");
        AbstractBox IBox2 = boxFactory.getShape("I");
        IBox2.display("黄色");
        System.out.println("两次获取的I形状方块是否是同一个对象："+(IBox1==IBox2));
    }
}

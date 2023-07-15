package com.xha.patterns.creater.builder.phone;

/**
 * 测试演示
 *
 * @author Xu huaiang
 * @date 2023/07/13
 */
public class TestDemo {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .cpu("骁龙888")
                .mainboard("高通")
                .memory("16G")
                .screen("三星")
                .build();
        System.out.println(phone);
    }
}

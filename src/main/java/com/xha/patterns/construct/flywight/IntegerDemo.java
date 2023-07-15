package com.xha.patterns.construct.flywight;

/**
 * 整数演示
 *
 * @author Xu huaiang
 * @date 2023/07/14
 */
public class IntegerDemo {
    public static void main(String[] args) {
        Integer i1 = 127;
        Integer i2 = 127;

        System.out.println("i1和i2对象是否是同一个对象？" + (i1 == i2));

        Integer i3 = 128;
        Integer i4 = 128;

        System.out.println("i3和i4对象是否是同一个对象？" + (i3 == i4));
    }
}

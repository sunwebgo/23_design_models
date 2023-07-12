package com.xha.principles.dependence;

/**
 * 数学
 *
 * @author Xu huaiang
 * @date 2023/07/12
 */
public class Math implements Course{
    @Override
    public void study() {
        System.out.println("学习数学");
    }
}

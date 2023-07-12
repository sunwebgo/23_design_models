package com.xha.principles.dependence;

/**
 * 语文
 *
 * @author Xu huaiang
 * @date 2023/07/12
 */
public class Chinese implements Course{
    @Override
    public void study() {
        System.out.println("学习语文");
    }
}

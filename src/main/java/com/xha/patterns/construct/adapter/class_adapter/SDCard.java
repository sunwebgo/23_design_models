package com.xha.patterns.construct.adapter.class_adapter;

/**
 * 目标接口
 *
 * @author Xu huaiang
 * @date 2023/07/13
 */
public interface SDCard {
    String readSD();

    void writeSD(String msg);
}

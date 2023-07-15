package com.xha.patterns.construct.adapter.class_adapter;

/**
 * 适配者接口
 *
 * @author Xu huaiang
 * @date 2023/07/13
 */
public interface TFCard {
    String readTF();

    void writeTF(String msg);
}

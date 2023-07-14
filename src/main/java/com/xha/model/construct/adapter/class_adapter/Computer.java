package com.xha.model.construct.adapter.class_adapter;

/**
 * 电脑
 *
 * @author Xu huaiang
 * @date 2023/07/13
 */
public class Computer {
    public String readSD(SDCard sdCard) {
        if (sdCard == null) {
            throw new NullPointerException("sd card is null");
        }
        return sdCard.readSD();
    }
}

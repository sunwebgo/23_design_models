package com.xha.patterns.construct.adapter.object_adapter;

/**
 * sdcard impl
 *
 * @author Xu huaiang
 * @date 2023/07/13
 */
public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        String msg = "SDCard read msg : hello word SDCard";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard write msg : " + msg);
    }
}

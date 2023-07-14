package com.xha.model.construct.adapter.object_adapter;

/**
 * 适配者类
 *
 * @author Xu huaiang
 * @date 2023/07/13
 */
public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        String msg = "TFCard read msg : hello word TFCard";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TFCard write msg : " + msg);
    }
}

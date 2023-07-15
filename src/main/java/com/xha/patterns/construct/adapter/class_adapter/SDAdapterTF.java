package com.xha.patterns.construct.adapter.class_adapter;

/**
 * 适配器类
 *
 * @author Xu huaiang
 * @date 2023/07/13
 */
public class SDAdapterTF extends TFCardImpl implements SDCard{
    @Override
    public String readSD() {
        System.out.println("adapter read tf card ");
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card ");
        writeTF(msg);
    }
}

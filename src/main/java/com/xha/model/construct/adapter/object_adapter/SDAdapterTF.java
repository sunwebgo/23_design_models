package com.xha.model.construct.adapter.object_adapter;

/**
 * 适配器类
 *
 * @author Xu huaiang
 * @date 2023/07/13
 */
public class SDAdapterTF implements SDCard {

//    声明适配者类
    private TFCard tfCard;

//    通过构造方法传入适配者类
    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("adapter read tf card ");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card ");
        tfCard.writeTF(msg);
    }
}

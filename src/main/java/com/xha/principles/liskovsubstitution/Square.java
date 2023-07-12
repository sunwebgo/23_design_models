package com.xha.principles.liskovsubstitution;

/**
 * 正方形
 *
 * @author Xu huaiang
 * @date 2023/07/12
 */
public class Square extends Rectangle {
    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void getArea(){
        System.out.println("正方形的面积为：" + this.getLength() * this.getWidth());
    }
}

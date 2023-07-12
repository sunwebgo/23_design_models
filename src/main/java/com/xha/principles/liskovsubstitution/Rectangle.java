package com.xha.principles.liskovsubstitution;

/**
 * 矩形
 *
 * @author Xu huaiang
 * @date 2023/07/12
 */
public class Rectangle {
    private double length;

    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void getArea(){
        System.out.println("矩形的面积为：" + this.length * this.width);
    }
}

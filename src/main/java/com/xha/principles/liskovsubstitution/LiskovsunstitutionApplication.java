package com.xha.principles.liskovsubstitution;

/**
 * liskovsunstitution应用程序
 *
 * @author Xu huaiang
 * @date 2023/07/12
 */
public class LiskovsunstitutionApplication {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);
        rectangle.getArea();
        Square square = new Square();
        square.setLength(20);
        square.getArea();
    }
}

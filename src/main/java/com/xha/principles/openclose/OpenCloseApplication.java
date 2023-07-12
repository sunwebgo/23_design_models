package com.xha.principles.openclose;

/**
 * 打开关闭应用程序
 *
 * @author Xu huaiang
 * @date 2023/07/12
 */
public class OpenCloseApplication {
    public static void main(String[] args) {
        Shape shape = new Rectangle();
        shape.draw();
        shape = new Circle();
        shape.draw();
    }
}

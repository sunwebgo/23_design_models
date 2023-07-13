package com.xha.model.creater.prototype.citation;

/**
 * 测试演示
 *
 * @author Xu huaiang
 * @date 2023/07/13
 */
public class TestDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
//        1.创建原型对象
        Citation citation = new Citation();
        citation.setName("张三");
//        2.克隆原型对象
        Citation clone = citation.clone();
        clone.setName("李四");

        citation.show();
        clone.show();
    }
}

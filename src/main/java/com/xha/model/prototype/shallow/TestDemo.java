package com.xha.model.prototype.shallow;

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
        Student student1 = new Student();
        student1.setName("张三");
        citation.setStu(student1);

//        2.克隆原型对象
        Citation clone = citation.clone();
        clone.getStu().setName("李四");

        citation.show();
        clone.show();
    }
}

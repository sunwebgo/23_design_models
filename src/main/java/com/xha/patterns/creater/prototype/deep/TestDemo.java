package com.xha.patterns.creater.prototype.deep;

import java.io.*;

/**
 * 测试演示
 *
 * @author Xu huaiang
 * @date 2023/07/13
 */
public class TestDemo {
    public static void main(String[] args) throws Exception {
//        1.创建原型对象
        Citation citation = new Citation();
        Student student1 = new Student();
        student1.setName("张三");
        citation.setStu(student1);

//        1.创建对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\deep.txt"));
//        2.将对象写入文件
        oos.writeObject(citation);
//        3.关闭流
        oos.close();

//        4.创建对象输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\deep.txt"));
//        5.从文件中读取对象
        Citation clone = (Citation) ois.readObject();
//        6.关闭流
        ois.close();

        clone.getStu().setName("李四");
        citation.show();
        clone.show();
    }
}

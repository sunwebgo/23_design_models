package com.xha.model.singleton.question;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 序列化问题
 *
 * @author Xu huaiang
 * @date 2023/07/12
 */
public class SerializeQuestion {
    public static void main(String[] args) {
        try {
//            writeObjectToFile();
            readObjectFromFile();
            readObjectFromFile();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeObjectToFile() throws Exception {
//        1.获取单例对象
        StaticFieldSingleton instance = StaticFieldSingleton.getInstance();
//        2.创建对象输出流,将对象写入文件
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:\\instance.txt"));
//        3.将对象写入文件
        objectOutputStream.writeObject(instance);
//        4.关闭流
        objectOutputStream.close();
    }

    public static void readObjectFromFile() throws Exception {
//        1.创建对象输入流，读取文件中的对象
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:\\instance.txt"));
//        2.读取对象
        StaticFieldSingleton instance = (StaticFieldSingleton) objectInputStream.readObject();
        System.out.println(instance);
//        3.关闭流
        objectInputStream.close();
    }
}

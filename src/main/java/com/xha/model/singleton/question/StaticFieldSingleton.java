package com.xha.model.singleton.question;

import java.io.Serializable;

/**
 * 静态字段单例
 *
 * @author Xu huaiang
 * @date 2023/07/12
 */
public class StaticFieldSingleton implements Serializable {
    //    1.创建私有化构造器
    private StaticFieldSingleton() {
        synchronized (StaticFieldSingleton.class) {
//          1.1在构造器中添加判断,如果该类已经被实例化了,则抛出异常,防止反射破坏单例
            if (instance != null) {
                throw new RuntimeException("该类已经被实例化了,不能再次被实例化");
            }
        }
    }

    //    2.创建私有化静态变量
    private static StaticFieldSingleton instance = new StaticFieldSingleton();

    //    3.提供公共的访问方式
    public static StaticFieldSingleton getInstance() {
        return instance;
    }
}

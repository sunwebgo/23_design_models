package com.xha.model.creater.singleton.hungry;

/**
 * 饿汉式（静态变量）
 *
 * @author Xu huaiang
 * @date 2023/07/12
 */
public class StaticFieldSingleton {
    //    1. 私有化构造器
    private StaticFieldSingleton() {
    }

    //    2.在本类中创建一个本类对象
    private static StaticFieldSingleton instance = new StaticFieldSingleton();

    //    3.提供一个公共的访问方式，让外界获取该对象。
    //    该方法必须是静态的，因为外界没有办法创建对象，只能通过类名调用
    public static StaticFieldSingleton getInstance() {
        return instance;
    }
}

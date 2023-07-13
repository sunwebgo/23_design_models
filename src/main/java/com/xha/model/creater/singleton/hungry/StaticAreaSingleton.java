package com.xha.model.creater.singleton.hungry;

/**
 * 饿汉式（静态代码块）
 *
 * @author Xu huaiang
 * @date 2023/07/12
 */
public class StaticAreaSingleton {
    //    1. 私有化构造器
    private StaticAreaSingleton() {
    }

    //    2.声明StaticAreaSingleton类型的变量
    private static StaticAreaSingleton instance; //null

    //    3.在静态代码块中，创建单例对象
    static {
        instance = new StaticAreaSingleton();
    }

    //    4.提供一个公共的访问方式，让外界获取该对象。
    public static StaticAreaSingleton getInstance() {
        return instance;
    }

}

package com.xha.model.singleton.lazy;

/**
 * 线程不安全的懒汉式
 *
 * @author Xu huaiang
 * @date 2023/07/12
 */
public class ThreadUnSafeSingleton {
//    1.私有化构造器
    private ThreadUnSafeSingleton(){
    }

//    2.创建该类的对象实例
     private static ThreadUnSafeSingleton instance;

//    3.提供一个公共的访问方式，让外界获取该对象。
    public static ThreadUnSafeSingleton getInstance(){
        if (instance == null){
            instance = new ThreadUnSafeSingleton();
        }
        return instance;
    }
}

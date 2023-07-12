package com.xha.model.singleton.lazy;

/**
 * 双重锁单例
 *
 * @author Xu huaiang
 * @date 2023/07/12
 */
public class DoubleLockSingleton {
    //    1.创建私有构造方法
    private DoubleLockSingleton() {
    }

    //    2.创建私有变量
    private static volatile DoubleLockSingleton instance;

    //    3.提供一个公共的访问方式，使外界对象能够获取到当前实例
    public static DoubleLockSingleton getInstance() {
//        4.第一次判断，如果instance为空，进入同步代码块。
//          不为空，直接返回instance
        if (instance == null) {
            synchronized (DoubleLockSingleton.class) {
                if (instance == null) {
                    instance = new DoubleLockSingleton();
                }
            }
        }
        return instance;
    }
}

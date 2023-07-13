package com.xha.model.creater.singleton.lazy;

/**
 * 静态内部类单例
 *
 * @author Xu huaiang
 * @date 2023/07/12
 */
public class StaticInnerSingleton {
//    1.私有化构造器
    private StaticInnerSingleton(){
    }
//    2.创建内部类
    private static class InnerClass{
        private static final StaticInnerSingleton INSTANCE =
                new StaticInnerSingleton();
    }
//    3.提供一个公共的访问方式，让外界获取该对象。
    public static StaticInnerSingleton getInstance(){
        return InnerClass.INSTANCE;
    }
}

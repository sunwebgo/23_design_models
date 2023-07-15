package com.xha.patterns.creater.singleton.question;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 反射问题
 *
 * @author Xu huaiang
 * @date 2023/07/12
 */
public class ReflectQuestion {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        1.获取到该类的字节码文件对象
        Class clazz = StaticFieldSingleton.class;
//        2.获取私有化构造器
        Constructor constructor = clazz.getDeclaredConstructor();
//        3.取消访问检查,暴力反射,破坏单例,创建多个对象
        constructor.setAccessible(true);
//        4.通过构造器创建对象
        StaticFieldSingleton instance1 = (StaticFieldSingleton) constructor.newInstance();
        StaticFieldSingleton instance2 = (StaticFieldSingleton) constructor.newInstance();
        System.out.println(instance1);
        System.out.println(instance2);
    }
}

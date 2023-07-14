package com.xha.model.construct.flywight;

import java.util.HashMap;

/**
 * 享元工厂角色（单例模式）
 *
 * @author Xu huaiang
 * @date 2023/07/14
 */
public class BoxFactory {
//    1.单例模式
    private static BoxFactory boxFactory;

//    2.创建一个map集合用于存储享元对象
    private static HashMap<String,AbstractBox> map;

//    3.私有化构造方法，在构造方法中初始化map集合
    private BoxFactory(){
        map = new HashMap<>();
        map.put("L",new LBox());
        map.put("I",new IBox());
        map.put("O",new OBox());
    }

//    4.提供一个获取享元对象的方法，根据key获取
    public AbstractBox getShape(String key){
        return map.get(key);
    }

//    5.提供一个获取单例对象的方法，如果对象为空则创建一个新的对象，否则返回已有的对象
    public static BoxFactory getInstance(){
        if (boxFactory == null){
            boxFactory = new BoxFactory();
        }
        return boxFactory;
    }
}

package com.xha.model.factory.simple_factory_config;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

/**
 * 咖啡工厂
 *
 * @author Xu huaiang
 * @date 2023/07/13
 */
public class CoffeeFactory {
    //    1.加载配置文件，获取配置文件中配置的全类名并创建对象，存储在map中
    private static HashMap<String, Coffee> map = new HashMap<>();

    //    2.加载配置文件，只需要加载一次
    static {
//        2.1创建Properties对象
        Properties properties = new Properties();
//        2.2获取输入流,使用类加载器,获取字节输入流,加载配置文件,获取文件路径
        InputStream resourceAsStream = CoffeeFactory.class.getClassLoader().getResourceAsStream("application.properties");
//        2.2加载配置文件
        try {
            properties.load(resourceAsStream);
//            2.3获取配置文件中配置的全类名并创建对象,存储在map中
            Set<Object> keys = properties.keySet();
            for (Object key : keys) {
                String className = properties.getProperty(key.toString());
//                2.4反射创建对象
                Class<?> clazz = Class.forName(className);
                Coffee coffee = (Coffee) clazz.newInstance();
                map.put(key.toString(), coffee);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 根据咖啡名称获取咖啡对象
     *
     * @return {@link Coffee}
     */
    public static Coffee createCoffee(String name) {
        return map.get(name);
    }
}

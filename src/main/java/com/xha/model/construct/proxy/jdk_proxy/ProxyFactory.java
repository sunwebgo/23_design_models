package com.xha.model.construct.proxy.jdk_proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理工厂
 *
 * @author Xu huaiang
 * @date 2023/07/13
 */
public class ProxyFactory {
//    声明火车站对象
    private TrainStation trainStation = new TrainStation();

//    获取代理对象
    public SellTickets getProxyObject() {
        //在程序运行期间，动态的创建TrainStation接口的代理对象
        /*
            newProxyInstance()方法参数说明：
                ClassLoader loader ： 类加载器，用于加载代理类，可以通过被代理对象获取类加载器
                Class<?>[] interfaces ： 被代理类实现的接口字节码对象数组
                InvocationHandler h ： 代理对象的调用处理程序
         */
        SellTickets proxyObject = (SellTickets) Proxy.newProxyInstance(
                trainStation.getClass().getClassLoader(), //类加载器
                trainStation.getClass().getInterfaces(), //真实对象所实现的接口的字节码对象数组
                new InvocationHandler() { //调用处理程序
                    /*
                        InvocationHandler中invoke方法参数说明：
                            proxy ： 代理对象,和proxyObject对象是同一个对象
                            method ： 代理对象调用的方法.对接口中的方法进行封装成method对象
                            args ： 代理对象调用接口方法时传递的实际参数
                    */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                        在invoke()方法中可以添加额外的逻辑
                        System.out.println("代售点收取一些服务费用");
//                        通过反射调用真实对象的方法
                        Object obj = method.invoke(trainStation, args);
                        return obj;
                    }
                }
        );
        return proxyObject;
    }
}

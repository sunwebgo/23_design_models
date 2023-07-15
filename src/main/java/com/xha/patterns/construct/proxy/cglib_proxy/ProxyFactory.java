package com.xha.patterns.construct.proxy.cglib_proxy;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 代理工厂
 *
 * @author Xu huaiang
 * @date 2023/07/13
 */
public class ProxyFactory implements MethodInterceptor {
//    声明火车站对象
    private TrainStation trainStation = new TrainStation();

    public TrainStation getProxyObject(){
//        1.创建Enhancer对象,类似于JDK代理中的Proxy类,下一步就是设置几个参数
        Enhancer enhancer = new Enhancer();
//        2.由于是继承代理,所以需要设置父类,父类就是目标类
        enhancer.setSuperclass(TrainStation.class);
//        3.设置回调函数,MethodInterceptor接口等效于JDK代理中的InvocationHandler接口
        enhancer.setCallback(this);
//        4.创建代理对象
        return (TrainStation) enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代售点收取一些服务费用");
        Object obj = method.invoke(trainStation, objects);
        return obj;
    }
}

package com.xha.model.creater.singleton;

import com.xha.model.creater.singleton.hungry.StaticAreaSingleton;
import com.xha.model.creater.singleton.hungry.StaticFieldSingleton;
import com.xha.model.creater.singleton.lazy.DoubleLockSingleton;
import com.xha.model.creater.singleton.lazy.StaticInnerSingleton;
import com.xha.model.creater.singleton.lazy.ThreadSafeSingleton;
import com.xha.model.creater.singleton.lazy.ThreadUnSafeSingleton;
import com.xha.model.creater.singleton.hungry.EnumSingleton;

/**
 * 单应用程序
 *
 * @author Xu huaiang
 * @date 2023/07/12
 */
public class SingletonApplication {
    public static void main(String[] args) {
        StaticFieldSingleton fieldInstance1 = StaticFieldSingleton.getInstance();
        StaticFieldSingleton fieldInstance2 = StaticFieldSingleton.getInstance();
        System.out.println("fieldInstance1 == fieldInstance2 ? " + (fieldInstance1 == fieldInstance2));
        System.out.println("-----------------------------");
        StaticAreaSingleton areaInstance1 = StaticAreaSingleton.getInstance();
        StaticAreaSingleton areaInstance2 = StaticAreaSingleton.getInstance();
        System.out.println("areaInstance1 == areaInstance2 ? " + (areaInstance1 == areaInstance2));
        System.out.println("-----------------------------");
        ThreadUnSafeSingleton threadUnsafeInstance1 = ThreadUnSafeSingleton.getInstance();
        ThreadUnSafeSingleton threadUnsafeInstance2 = ThreadUnSafeSingleton.getInstance();
        System.out.println("threadUnsafeInstance1 == threadUnsafeInstance2 ? " + (threadUnsafeInstance1 == threadUnsafeInstance2));
        System.out.println("-----------------------------");
        ThreadSafeSingleton threadSafeInstance1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton threadSafeInstance2 = ThreadSafeSingleton.getInstance();
        System.out.println("threadSafeInstance1 == threadSafeInstance2 ? " + (threadSafeInstance1 == threadSafeInstance2));
        System.out.println("-----------------------------");
        DoubleLockSingleton doubleLockInstance1 = DoubleLockSingleton.getInstance();
        DoubleLockSingleton doubleLockInstance2 = DoubleLockSingleton.getInstance();
        System.out.println("doubleLockInstance1 == doubleLockInstance2 ? " + (doubleLockInstance1 == doubleLockInstance2));
        System.out.println("-----------------------------");
        StaticInnerSingleton staticInnerInstance1 = StaticInnerSingleton.getInstance();
        StaticInnerSingleton staticInnerInstance2 = StaticInnerSingleton.getInstance();
        System.out.println("staticInnerInstance1 == staticInnerInstance2 ? " + (staticInnerInstance1 == staticInnerInstance2));
        System.out.println("-----------------------------");
        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;
        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;
        System.out.println("enumSingleton1 == enumSingleton2 ? " + (enumSingleton1 == enumSingleton2));
    }
}

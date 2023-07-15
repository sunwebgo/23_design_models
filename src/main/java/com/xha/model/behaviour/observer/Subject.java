package com.xha.model.behaviour.observer;

/**
 * 抽象主题
 *
 * @author Xu huaiang
 * @date 2023/07/15
 */
public interface Subject {
//    添加观察者
    void addAttach(Observer observer);

//    删除观察者
    void detach(Observer observer);

//    通知观察者
    void notify(String message);
}

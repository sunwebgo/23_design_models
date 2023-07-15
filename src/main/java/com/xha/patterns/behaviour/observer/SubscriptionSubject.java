package com.xha.patterns.behaviour.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体主题
 *
 * @author Xu huaiang
 * @date 2023/07/15
 */
public class SubscriptionSubject implements Subject{
    private List<Observer> weixinUserList = new ArrayList<>();

    @Override
    public void addAttach(Observer observer) {
        weixinUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weixinUserList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : weixinUserList) {
            observer.update(message);
        }
    }
}

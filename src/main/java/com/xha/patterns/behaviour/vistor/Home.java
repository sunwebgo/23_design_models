package com.xha.patterns.behaviour.vistor;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构类
 *
 * @author Xu huaiang
 * @date 2023/07/15
 */
public class Home {
//    声明一个集合用于存储元素对象
    private List<Animal> nodeList = new ArrayList<>();
//    添加元素
    public void add(Animal animal){
        nodeList.add(animal);
    }
    public void action(Person person){
        for (Animal animal : nodeList) {
            animal.accept(person);
        }
    }
}

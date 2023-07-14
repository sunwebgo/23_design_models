package com.xha.model.construct.combine;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝节点
 *
 * @author Xu huaiang
 * @date 2023/07/14
 */
public class Menu extends MenuComponent{
//    菜单可以有子菜单或者子菜单项，所以菜单中要有一个菜单项的集合
    private List<MenuComponent> menuComponentList = new ArrayList<>();

    public Menu(String name,int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponentList.get(i);
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println("菜单名字："+name+"，菜单级别："+level);
        for (MenuComponent menuComponent : menuComponentList) {
            menuComponent.print();
        }
    }
}

package com.xha.patterns.construct.combine;

/**
 * 叶子节点
 *
 * @author Xu huaiang
 * @date 2023/07/14
 */
public class MenuItem extends MenuComponent{

    public MenuItem(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);
    }
}

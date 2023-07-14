package com.xha.model.construct.combine;

/**
 * 抽象根节点
 *
 * @author Xu huaiang
 * @date 2023/07/14
 */
public abstract class MenuComponent {
    protected String name;
    protected int level;

    /**
     * 添加菜单组件，可以是菜单项，也可以是菜单
     *
     * @param menuComponent 菜单组件
     */
    public void add(MenuComponent menuComponent) {
//        抛出异常，子类实现，这里不实现，因为菜单项没有添加菜单的功能
        throw new UnsupportedOperationException();
    }

    /**
     * 移除菜单组件，可以是菜单项，也可以是菜单
     *
     * @param menuComponent 菜单组件
     */
    public void remove(MenuComponent menuComponent) {
//        抛出异常，子类实现，这里不实现，因为菜单项没有移除菜单的功能
        throw new UnsupportedOperationException();
    }

    /**
     * 获取到指定位置的菜单组件，可以是菜单项，也可以是菜单
     *
     * @param i 我
     * @return {@link MenuComponent}
     */
    public MenuComponent getChild(int i) {
//        抛出异常，子类实现，这里不实现，因为菜单项没有获取菜单的功能
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public abstract void print();
}

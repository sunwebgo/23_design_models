package com.xha.model.creater.prototype.relizetype;

/**
 * realizetype
 *
 * @author Xu huaiang
 * @date 2023/07/13
 */
public class Realizetype implements Cloneable {

    public Realizetype() {
        System.out.println("具体原型创建成功");
    }

    @Override
    protected Realizetype clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功");
        return (Realizetype) super.clone();
    }

}

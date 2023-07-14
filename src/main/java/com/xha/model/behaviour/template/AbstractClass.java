package com.xha.model.behaviour.template;

/**
 * 抽象类
 *
 * @author Xu huaiang
 * @date 2023/07/14
 */
public abstract class AbstractClass {

    /**
     * 模板方法
     */
    public final void cookProcess() {
        this.pourOil();
        this.heatOil();
        this.pourVegetable();
        this.pourSauce();
        this.fry();
    }

    /**
     * 倒油
     */
    public void pourOil() {
        System.out.println("倒油");
    }

    /**
     * 热油
     */
    public void heatOil() {
        System.out.println("热油");
    }

    /**
     * 导蔬菜
     */
    public abstract void pourVegetable();

    /**
     * 倒调料
     */
    public abstract void pourSauce();

    /**
     * 翻炒
     */
    public void fry() {
        System.out.println("炒啊炒啊炒到熟啊");
    }
}

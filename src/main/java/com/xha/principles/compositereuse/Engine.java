package com.xha.principles.compositereuse;

/**
 * 引擎
 *
 * @author Xu huaiang
 * @date 2023/07/12
 */
public class Engine {
    private String name;

    public Engine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

package com.xha.model.construct.flywight;

/**
 * 具体享元角色
 *
 * @author Xu huaiang
 * @date 2023/07/14
 */
public class IBox extends AbstractBox{
    @Override
    public String getShape() {
        return "I形状的方块";
    }
}

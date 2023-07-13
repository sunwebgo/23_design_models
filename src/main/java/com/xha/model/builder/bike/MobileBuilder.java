package com.xha.model.builder.bike;

/**
 * 移动建设者
 *
 * @author Xu huaiang
 * @date 2023/07/13
 */
public class MobileBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}

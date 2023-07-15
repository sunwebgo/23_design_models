package com.xha.patterns.creater.builder.bike;

/**
 * ofo自行车
 *
 * @author Xu huaiang
 * @date 2023/07/13
 */
public class OfoBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}

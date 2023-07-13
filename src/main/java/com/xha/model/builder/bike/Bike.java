package com.xha.model.builder.bike;

/**
 * 自行车
 *
 * @author Xu huaiang
 * @date 2023/07/13
 */
public class Bike {
    private String frame;
    private String seat;

    public String getFrame() {
        return frame;
    }

    public Bike setFrame(String frame) {
        this.frame = frame;
        return this;
    }

    public String getSeat() {
        return seat;
    }

    public Bike setSeat(String seat) {
        this.seat = seat;
        return this;
    }


    @Override
    public String toString() {
        return "Bike{" +
                "frame='" + frame + '\'' +
                ", seat='" + seat + '\'' +
                '}';
    }
}

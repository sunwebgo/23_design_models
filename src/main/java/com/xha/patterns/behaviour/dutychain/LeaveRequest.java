package com.xha.patterns.behaviour.dutychain;

/**
 * 请假类
 *
 * @author Xu huaiang
 * @date 2023/07/14
 */
public class LeaveRequest {
    private String name;
    private int num;
    private String reason;
    public LeaveRequest(String name, int num, String reason) {
        this.name = name;
        this.num = num;
        this.reason = reason;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public String getReason() {
        return reason;
    }
}

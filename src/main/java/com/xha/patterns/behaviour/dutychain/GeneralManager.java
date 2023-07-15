package com.xha.patterns.behaviour.dutychain;

/**
 * 具体处理者
 *
 * @author Xu huaiang
 * @date 2023/07/14
 */
public class GeneralManager extends Handler {
    public GeneralManager() {
        super(Handler.NUM_THREE, Handler.NUM_SEVEN);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天，原因：" + leave.getReason());
        System.out.println("总经理审批...");
    }
}

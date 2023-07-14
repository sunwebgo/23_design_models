package com.xha.model.behaviour.dutychain;

/**
 * 具体处理者
 *
 * @author Xu huaiang
 * @date 2023/07/14
 */
public class Manager extends Handler{
    public Manager() {
        super(Handler.NUM_ONE,Handler.NUM_THREE);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName()+"请假"+leave.getNum()+"天，原因："+leave.getReason());
        System.out.println("部门经理审批...");
    }
}

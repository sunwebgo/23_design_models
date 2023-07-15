package com.xha.patterns.behaviour.dutychain;

/**
 * 具体处理者
 *
 * @author Xu huaiang
 * @date 2023/07/14
 */
public class GroupLeader extends Handler{

    public GroupLeader() {
        super(0,Handler.NUM_ONE);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName()+"请假"+leave.getNum()+"天，原因："+leave.getReason());
        System.out.println("小组长审批...");
    }
}

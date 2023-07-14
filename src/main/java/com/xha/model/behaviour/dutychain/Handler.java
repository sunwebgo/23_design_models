package com.xha.model.behaviour.dutychain;

/**
 * 抽象处理者
 *
 * @author Xu huaiang
 * @date 2023/07/14
 */
public abstract class Handler {
    protected static final int NUM_ONE = 1;
    protected static final int NUM_THREE = 3;
    protected static final int NUM_SEVEN = 7;

    //    1.设置处理者的处理范围
    private int numStart;
    private int numEnd;
    //    2.设置下一个处理者
    private Handler nextHandler;

    public Handler(int numStart) {
        this.numStart = numStart;
    }

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    //    设置上级处理者
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    //    处理请假请求
    protected abstract void handleLeave(LeaveRequest leaveRequest);

//    提交请假请求
    public void submit(LeaveRequest leave) {
        this.handleLeave(leave);
        if (this.nextHandler != null && leave.getNum() > this.numEnd) {
            this.nextHandler.submit(leave);
        } else {
            System.out.println("请假请求已经处理完毕");
        }
    }

}

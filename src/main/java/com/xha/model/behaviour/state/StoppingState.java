package com.xha.model.behaviour.state;

/**
 * 停止状态
 *
 * @author Xu huaiang
 * @date 2023/07/15
 */
public class StoppingState extends LiftState{

    public StoppingState(Context context) {
        super(context);
    }

    @Override
    public void open() {
        context.setLiftState(Context.OPENING_STATE);
        context.getLiftState().open();
    }

    @Override
    public void close() {
        context.setLiftState(Context.CLOSING_STATE);
        context.getLiftState().close();
    }

    @Override
    public void run() {
        context.setLiftState(Context.RUNNING_STATE);
        context.getLiftState().run();
    }

    @Override
    public void stop() {
        System.out.println("电梯停止");
    }
}

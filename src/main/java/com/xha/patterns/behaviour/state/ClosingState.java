package com.xha.patterns.behaviour.state;

/**
 * 关闭状态
 *
 * @author Xu huaiang
 * @date 2023/07/15
 */
public class ClosingState extends LiftState {

    public ClosingState(Context context) {
        super(context);
    }

    @Override
    public void open() {
        context.setLiftState(Context.OPENING_STATE);
        context.getLiftState().open();
    }

    @Override
    public void close() {
        System.out.println("电梯关闭");
    }

    @Override
    public void run() {
        context.setLiftState(Context.RUNNING_STATE);
        context.getLiftState().run();
    }

    @Override
    public void stop() {
        context.setLiftState(Context.STOPPING_STATE);
        context.getLiftState().stop();
    }
}

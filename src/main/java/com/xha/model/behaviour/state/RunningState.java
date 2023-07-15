package com.xha.model.behaviour.state;

/**
 * 运行状态
 *
 * @author Xu huaiang
 * @date 2023/07/15
 */
public class RunningState extends LiftState {

    public RunningState(Context context) {
        super(context);
    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        System.out.println("电梯正在运行");
    }

    @Override
    public void stop() {
        context.setLiftState(Context.STOPPING_STATE);
        context.getLiftState().stop();
    }
}

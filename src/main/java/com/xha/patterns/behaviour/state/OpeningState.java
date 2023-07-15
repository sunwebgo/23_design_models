package com.xha.patterns.behaviour.state;

/**
 * 电梯开启状态
 *
 * @author Xu huaiang
 * @date 2023/07/15
 */
public class OpeningState extends LiftState{

    public OpeningState(Context context) {
        super(context);
    }

    @Override
    public void open() {
        System.out.println("电梯开启");
    }

    @Override
    public void close() {
        context.setLiftState(Context.CLOSING_STATE);
        context.getLiftState().close();
    }

    @Override
    public void run() {
    }

    @Override
    public void stop() {

    }
}

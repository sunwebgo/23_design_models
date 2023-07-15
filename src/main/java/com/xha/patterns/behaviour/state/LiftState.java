package com.xha.patterns.behaviour.state;

/**
 * 抽象状态类
 *
 * @author Xu huaiang
 * @date 2023/07/15
 */
public abstract class LiftState {

    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public LiftState(Context context) {
        this.context = context;
    }

    public abstract void open();

    public abstract void close();

    public abstract void run();

    public abstract void stop();
}

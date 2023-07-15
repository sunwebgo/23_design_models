package com.xha.patterns.behaviour.state;

/**
 * 环境角色类
 *
 * @author Xu huaiang
 * @date 2023/07/15
 */
public class Context {

    public static final LiftState OPENING_STATE = new OpeningState(new Context());
    public static final LiftState CLOSING_STATE = new ClosingState(new Context());
    public static final LiftState RUNNING_STATE = new RunningState(new Context());
    public static final LiftState STOPPING_STATE = new StoppingState(new Context());

    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

    public void open() {
        this.liftState.open();
    }

    public void close() {
        this.liftState.close();
    }

    public void run() {
        this.liftState.run();
    }

    public void stop() {
        this.liftState.stop();
    }
}

package com.xha.model.behaviour.state;

/**
 * 客户端
 *
 * @author Xu huaiang
 * @date 2023/07/15
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new ClosingState(context));
        context.open();
        context.run();
        context.close();
        context.stop();
    }
}

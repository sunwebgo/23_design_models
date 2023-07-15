package com.xha.patterns.behaviour.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 请求者类
 *
 * @author Xu huaiang
 * @date 2023/07/14
 */
public class Waiter {
//    只有多个命令对象
    private List<Command> commands = new ArrayList<>();

    public void setCommand(Command command) {
        commands.add(command);
    }

//    发起请求
    public void orderUp() {
        System.out.println("服务员通知厨师做菜");
        for (Command command : commands) {
            command.execute();
        }
    }
}

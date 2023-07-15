package com.xha.patterns.behaviour.dutychain;

/**
 * 客户端
 *
 * @author Xu huaiang
 * @date 2023/07/14
 */
public class Client {
    public static void main(String[] args) {
        LeaveRequest leaveRequest = new LeaveRequest("小明", 2, "生病");
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();

//        设置处理链
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);
//        发起请求
        groupLeader.submit(leaveRequest);
    }
}

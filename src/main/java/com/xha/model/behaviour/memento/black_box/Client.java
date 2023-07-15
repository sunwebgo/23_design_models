package com.xha.model.behaviour.memento.black_box;

/**
 * 客户端
 *
 * @author Xu huaiang
 * @date 2023/07/15
 */
public class Client {
    public static void main(String[] args) {
//        1.创建发起人
        GameRole gameRole = new GameRole();
//        2.初始化游戏角色
        gameRole.initState();
//        3.查看游戏角色状态
        gameRole.displayState();
//        4.创建管理者，保存游戏角色状态
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
//          4.1设置备忘录对象，内部是创建备忘录对象
        roleStateCaretaker.setMemento(gameRole.saveState());
//        5.战斗
        gameRole.fight();
//        6.查看游戏角色状态
        gameRole.displayState();
//        7.发起人恢复备忘录对象保存的状态
        gameRole.recoverState(roleStateCaretaker.getMemento());
//        8.查看游戏角色状态
        gameRole.displayState();
    }
}

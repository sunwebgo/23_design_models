package com.xha.patterns.behaviour.memento.white_box;

/**
 * 管理者
 *
 * @author Xu huaiang
 * @date 2023/07/15
 */
public class RoleStateCaretaker {

    private RoleStateMemento memento;

    public RoleStateMemento getMemento() {
        return memento;
    }

    public void setMemento(RoleStateMemento memento) {
        this.memento = memento;
    }
}

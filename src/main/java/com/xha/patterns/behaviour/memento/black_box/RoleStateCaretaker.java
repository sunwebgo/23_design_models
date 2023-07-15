package com.xha.patterns.behaviour.memento.black_box;

/**
 * 管理者
 *
 * @author Xu huaiang
 * @date 2023/07/15
 */
public class RoleStateCaretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}

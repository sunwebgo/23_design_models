package com.xha.model.behaviour.memento.black_box;

import com.xha.model.behaviour.memento.white_box.RoleStateMemento;

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

package com.prc.desiners.备忘录模式.demo1;

// 原型管理者
public class PrototypeCaretaker {
    private OriginatorPrototype opt;

    public void setMemento(OriginatorPrototype opt) {
        this.opt=opt;
    }

    public OriginatorPrototype getMemento() {
        return opt;
    }
}

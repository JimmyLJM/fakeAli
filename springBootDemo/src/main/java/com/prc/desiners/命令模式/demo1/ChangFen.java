package com.prc.desiners.命令模式.demo1;

/**
 * 具体命令：肠粉
 */
public class ChangFen implements Breakfast{

    private ChangFenChef receiver;

    ChangFen() {
        receiver=new ChangFenChef();
    }

    public void cooking() {
        receiver.cooking();
    }
}

package com.prc.desiners.命令模式.demo1;

//具体命令：混沌
public class HunTun implements Breakfast{

    private HunTunChef receiver;

    HunTun() {
        receiver=new HunTunChef();
    }

    public void cooking() {
        receiver.cooking();
    }
}

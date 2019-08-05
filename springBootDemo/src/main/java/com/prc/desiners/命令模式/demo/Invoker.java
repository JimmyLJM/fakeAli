package com.prc.desiners.命令模式.demo;

/**
 *  命令模式调用者
 *
 */
public class Invoker {

    // 持有命令实例
    private Command command;

    public Invoker(Command command) {
        this.command=command;
    }

    public void setCommand(Command command) {
        this.command=command;
    }

    // 调用命令
    public void call() {
        System.out.println("调用者执行命令command...");
        command.execute();
    }
}

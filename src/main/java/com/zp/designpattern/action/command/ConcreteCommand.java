package com.zp.designpattern.action.command;

/**
 * Created by zhangpeng01 on 2019/2/13.
 */
public class ConcreteCommand implements Command{

    Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void excute() {
        receiver.action();
    }

    @Override
    public void unDo() {
        receiver.unAction();
    }
}

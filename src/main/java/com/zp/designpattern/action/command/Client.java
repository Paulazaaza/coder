package com.zp.designpattern.action.command;

/**
 * Created by zhangpeng01 on 2019/2/13.
 */
public class Client {

    public static void main(String[] args){
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.excuteCommand();
        invoker.undoCommand();
    }
}

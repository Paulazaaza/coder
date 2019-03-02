package com.zp.designpattern.action.command;

/**
 * Created by zhangpeng01 on 2019/2/13.
 */
public class Invoker {

    Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void excuteCommand(){
        command.excute();
    }

    public void undoCommand(){
        command.unDo();
    }
}

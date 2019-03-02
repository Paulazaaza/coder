package com.zp.designpattern.action.chain;

/**
 * Created by zhangpeng01 on 2019/2/13.
 */
public abstract class Handler {

    protected Handler successor;

    public abstract void handleRequest();

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}

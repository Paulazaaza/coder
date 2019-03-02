package com.zp.designpattern.action.chain;

/**
 * Created by zhangpeng01 on 2019/2/13.
 */
public class Client {

    public static void main(String[] args){
        Handler handler1 = new ConcreteHandler();
        Handler handler2 = new ConcreteHandler();
        handler1.setSuccessor(handler2);
        handler1.handleRequest();
    }
}

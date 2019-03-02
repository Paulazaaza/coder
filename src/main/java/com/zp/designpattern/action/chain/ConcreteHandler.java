package com.zp.designpattern.action.chain;

/**
 * Created by zhangpeng01 on 2019/2/13.
 */
public class ConcreteHandler extends Handler{
    @Override
    public void handleRequest() {
        if(getSuccessor() != null){
            System.out.println("放过请求");
            getSuccessor().handleRequest();
        }else{
            System.out.println("处理请求");
        }
    }
}

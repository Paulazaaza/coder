package com.zp.designpattern.struct.proxy;

/**
 * Created by zhangpeng01 on 2019/1/16.
 */
public class UserImpl implements User {

    @Override
    public void eat(String food) {
        System.out.println("eat: "+food);
    }

}

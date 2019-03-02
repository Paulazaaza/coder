package com.zp.designpattern.struct.proxy;

/**
 * Created by zhangpeng01 on 2019/1/16.
 */
public class StaticProxyUserImpl implements User{

    private User user = new UserImpl();

    @Override
    public void eat(String food) {
        user.eat(food);
    }
}

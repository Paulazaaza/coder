package com.zp.designpattern.build.factory;

/**
 * Created by zhangpeng01 on 2019/1/8.
 */
public class AbstractFactoryB implements AbstractFactory{


    @Override
    public Product getProduct() {
        return new ProductB();
    }

    @Override
    public Gift getGift() {
        return new GiftB();
    }
}

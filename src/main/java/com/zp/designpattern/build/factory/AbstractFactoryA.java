package com.zp.designpattern.build.factory;

/**
 * Created by zhangpeng01 on 2019/1/8.
 */
public class AbstractFactoryA implements AbstractFactory{


    @Override
    public Product getProduct() {
        return new ProductA();
    }

    @Override
    public Gift getGift() {
        return new GiftA();
    }
}

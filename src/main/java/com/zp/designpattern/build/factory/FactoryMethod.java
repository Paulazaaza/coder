package com.zp.designpattern.build.factory;

/**
 * 工厂方法模式
 * Created by zhangpeng01 on 2019/1/8.
 */
public class FactoryMethod {

    public static void main(String args[]){
        Factory factory = new FactoryA();
        Product product = factory.getProduct();

        factory = new FactoryB();
        product = factory.getProduct();
    }
}

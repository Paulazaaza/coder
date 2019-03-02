package com.zp.designpattern.build.factory;

/**
 * Created by zhangpeng01 on 2019/1/8.
 */
public class FactoryB implements Factory{

    public Product getProduct(){
        return new ProductB();
    }

}

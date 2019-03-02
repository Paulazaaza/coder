package com.zp.designpattern.build.factory;

/**
 * Created by zhangpeng01 on 2019/1/8.
 */
public class FactoryA implements Factory{

    public Product getProduct(){
        return new ProductA();
    }

}

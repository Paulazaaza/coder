package com.zp.designpattern.build.factory;

/**
 * 简单工厂
 * Created by zhangpeng01 on 2019/1/8.
 */
public class SimpleFactory {

    private static String TYPE_A = "A";

    private static String TYPE_B = "B";

    public static Product createProduct(String type){
        Product product = null;
        if(TYPE_A.equalsIgnoreCase(type)){
            product = new ProductA();
        }else if(TYPE_B.equalsIgnoreCase(type)){
            product = new ProductB();
        }
        return product;
    }
}

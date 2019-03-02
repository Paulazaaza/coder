package com.zp.designpattern.build.factory;

/**
 * Created by zhangpeng01 on 2019/1/8.
 */
public interface AbstractFactory {

    /**
     * 获取产品
     * @return
     */
    Product getProduct();

    /**
     * 获取礼物
     * @return
     */
    Gift getGift();
}

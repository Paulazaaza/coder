package com.zp.designpattern.struct.adapter;

/**
 * Created by zhangpeng01 on 2019/1/29.
 */
public class ConcreteA extends AbstractA{
    @Override
    public void a() {
        super.a();
        System.out.println("a");
    }
}

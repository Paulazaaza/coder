package com.zp.designpattern.struct.component;

/**
 * Created by zhangpeng01 on 2019/1/16.
 */
public class Cow implements Animal {
    @Override
    public void eat() {
        System.out.println("cow");
    }
}

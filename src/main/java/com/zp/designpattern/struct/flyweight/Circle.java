package com.zp.designpattern.struct.flyweight;

/**
 * Created by zhangpeng01 on 2019/1/31.
 */
public class Circle extends Shape{

    private String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("color:"+color);
    }
}

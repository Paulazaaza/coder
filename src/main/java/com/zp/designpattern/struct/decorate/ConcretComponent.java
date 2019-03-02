package com.zp.designpattern.struct.decorate;

/**
 * Created by zhangpeng01 on 2019/1/29.
 */
public class ConcretComponent implements Component{
    @Override
    public void work() {
        System.out.println("work");
    }
}

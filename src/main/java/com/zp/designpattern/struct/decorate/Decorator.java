package com.zp.designpattern.struct.decorate;

/**
 * Created by zhangpeng01 on 2019/1/29.
 */
public class Decorator implements Component{

    public Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void work() {
        component.work();
    }
}

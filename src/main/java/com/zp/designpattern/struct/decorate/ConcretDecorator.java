package com.zp.designpattern.struct.decorate;

/**
 * Created by zhangpeng01 on 2019/1/29.
 */
public class ConcretDecorator extends Decorator{

    public ConcretDecorator(Component component) {
        super(component);
    }

    @Override
    public void work(){
        this.component.work();
    }
}

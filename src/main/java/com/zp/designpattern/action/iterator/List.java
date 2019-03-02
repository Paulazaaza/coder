package com.zp.designpattern.action.iterator;

/**
 * Created by zhangpeng01 on 2019/1/31.
 */
public interface List {
    public void add(Object obj);
    public Object get(int index);
    public int getSize();
    public com.zp.designpattern.action.iterator.Iterator iterator();
}

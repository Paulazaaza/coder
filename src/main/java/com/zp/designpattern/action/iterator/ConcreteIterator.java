package com.zp.designpattern.action.iterator;

/**
 * Created by zhangpeng01 on 2019/2/13.
 */
public class ConcreteIterator implements Iterator{

    private List list = null;

    private int index;

    public ConcreteIterator(List list) {
        super();
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if(index >= list.getSize()){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        Object obj = list.get(index);
        index++;
        return obj;
    }
}

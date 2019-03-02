package com.zp.designpattern.struct.adapter;

/**
 * Created by zhangpeng01 on 2019/1/29.
 */
public class Ps2Adapter extends UsbImpl implements Ps2{
    @Override
    public void isPs2() {
        System.out.println("adapter usb");
        isUsb();
    }
}

package com.zp.designpattern.struct.adapter;

/**
 * Created by zhangpeng01 on 2019/1/29.
 */
public class UsbImpl implements Usb{
    @Override
    public void isUsb() {
        System.out.println("usb");
    }
}

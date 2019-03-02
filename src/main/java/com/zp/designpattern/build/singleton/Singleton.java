package com.zp.designpattern.build.singleton;

/**
 * DCL双重校验锁
 * Created by zhangpeng01 on 2019/1/8.
 */
public class Singleton {

    private static Singleton singleton;

    private Singleton(){}

    public static Singleton getSingleton(){
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}

package com.zp.designpattern.struct.facade;

/**
 * Created by zhangpeng01 on 2019/1/16.
 */
public class Computer {

    private Cpu cpu;
    private Disk disk;

    public Computer(Cpu cpu,Disk disk){
        this.cpu = cpu;
        this.disk = disk;
    }

    public void start(){
        cpu.start();
        disk.start();
    }

    public void end(){
        cpu.end();
        disk.end();
    }
}

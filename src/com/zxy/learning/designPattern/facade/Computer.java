package com.zxy.learning.designPattern.facade;

/**
 * @author zxy
 * @version 1.0.0
 * @ClassName Computer.java
 * @Description
 * @createTime 2019年08月17日 04:10:00
 */
public class Computer {

    private CPU cpu;

    private Disk disk;

    private Memory memory;

    public Computer(CPU cpu, Disk disk, Memory memory) {
        this.cpu = cpu;
        this.disk = disk;
        this.memory = memory;
    }

    public void start(){
        cpu.start();
        disk.start();
        memory.start();
    }

    public void close(){
        cpu.close();
        disk.close();
        memory.close();
    }

}

package com.zxy.learning.designPattern.facade;

/**
 * @author zxy
 * @version 1.0.0
 * @ClassName Disk.java
 * @Description
 * @createTime 2019年08月17日 04:11:00
 */
public class Disk {

    public void start(){
        System.out.println("Disk START");
    }

    public void close(){
        System.out.println("Disk CLOSE");
    }
}

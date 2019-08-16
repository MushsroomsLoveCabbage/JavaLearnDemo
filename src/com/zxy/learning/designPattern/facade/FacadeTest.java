package com.zxy.learning.designPattern.facade;

/**
 * @author zxy
 * @version 1.0.0
 * @ClassName FacadeTest.java
 * @Description 外观模式（Facade） 解决类于类之间的依赖，减少耦合。
 * @createTime 2019年08月17日 04:10:00
 */
public class FacadeTest {

    public static void main(String[] args){

        Computer computer = new Computer(new CPU(), new Disk(), new Memory());
        computer.start();
        computer.close();

    }
}

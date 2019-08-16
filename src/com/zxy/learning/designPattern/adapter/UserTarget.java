package com.zxy.learning.designPattern.adapter;

/**
 * @author zxy
 * @version 1.0.0
 * @ClassName UserTarget.java
 * @Description
 * @createTime 2019年08月17日 02:44:00
 */
public class UserTarget implements Target{

    private final static int USER_NEED_VOLTAGE = 100;

    @Override
    public int provideSpecial() {
        System.out.println("玩家需要什么标准电压: " + USER_NEED_VOLTAGE);
        return USER_NEED_VOLTAGE;
    }
}

package com.zxy.learning.designPattern.adapter;


/**
 * @author zxy
 * @version 1.0.0
 * @ClassName Adapter.java
 * @Description
 * @createTime 2019年08月17日 02:46:00
 */
public class ClassAdapter extends AmericanVoltageStandard implements Target {

    @Override
    public int provideSpecial() {
        int voltage = super.provide();
        int result = voltage - 120;
        return result;
    }

}

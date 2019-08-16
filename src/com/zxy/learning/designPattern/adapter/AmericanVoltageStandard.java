package com.zxy.learning.designPattern.adapter;

/**
 * @author zxy
 * @version 1.0.0
 * @ClassName ChineseVoltageStandard.java
 * @Description 中国电压标准
 * @createTime 2019年08月17日 02:37:00
 */
public class AmericanVoltageStandard implements VoltageStandard {

    private static int AMERICAN_VOLTAGE_STANDARD = 120;

    @Override
    public int provide(){
        System.out.println("美国生成120V电压");
        return AMERICAN_VOLTAGE_STANDARD;
    }
}

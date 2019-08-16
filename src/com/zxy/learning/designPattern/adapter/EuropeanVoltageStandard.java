package com.zxy.learning.designPattern.adapter;

/**
 * @author zxy
 * @version 1.0.0
 * @ClassName ChineseVoltageStandard.java
 * @Description 中国电压标准
 * @createTime 2019年08月17日 02:37:00
 */
public class EuropeanVoltageStandard implements VoltageStandard {

    private static int EUROPEAN_VOLTAGE_STANDARD = 220;

    @Override
    public int provide(){
        System.out.println("欧盟 生成220V电压");
        return EUROPEAN_VOLTAGE_STANDARD;
    }
}

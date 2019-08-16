package com.zxy.learning.designPattern.adapter;

/**
 * @author zxy
 * @version 1.0.0
 * @ClassName ChineseVoltageStandard.java
 * @Description 中国电压标准
 * @createTime 2019年08月17日 02:37:00
 */
public class JanpaneseVoltageStandard implements VoltageStandard{

    private static int JANPANESE_VOLTAGE_STANDARD = 100;

    @Override
    public int provide(){
        System.out.println("日本 生成100V电压");
        return JANPANESE_VOLTAGE_STANDARD;
    }
}

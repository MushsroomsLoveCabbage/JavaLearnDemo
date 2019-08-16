package com.zxy.learning.designPattern.adapter;

/**
 * @Title
 * @Description 日标转国标
 * @Author zxy
 * @Param
 * @UpdateTime 2019/8/17 3:46
 * @throws
 */
public class JpToCnAdapter implements ObjectAdapter{

    private VoltageStandard voltageStandard;

    @Override
    public int specialProvide() {
        int source = voltageStandard.provide();
        int result = source - 100;
        System.out.println("输出日标转国标了");
        return result;
    }

    public JpToCnAdapter(VoltageStandard voltageStandard) {
        this.voltageStandard = voltageStandard;
    }
}

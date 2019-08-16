package com.zxy.learning.designPattern.adapter;

/**
 * @author zxy
 * @version 1.0.0
 * @ClassName AdapterTest.java
 * @Description  Adapter 模式 关键点在于接受功能提供源，然后隐藏转换实现细节，对外提供目标功能。
 * @createTime 2019年08月17日 02:55:00
 */
public class AdapterTest {

    public static void main(String[] args){

        AmericanVoltageStandard americanVoltageStandard = new AmericanVoltageStandard();
        americanVoltageStandard.provide();

        UserTarget userTarget = new UserTarget();
        userTarget.provideSpecial();

        ClassAdapter adapter = new ClassAdapter();
        adapter.provideSpecial();

        JpToCnAdapter objectAdapter = new JpToCnAdapter(new JanpaneseVoltageStandard());

        objectAdapter.specialProvide();
    }
}

package com.zxy.learning.designPattern.basicPattern;

public abstract class AbstractSkill implements Iskill{

    private int number = 2;

    @Override
    public void freed() {
        System.out.println("默认释放！");
    }

    protected void commonAddBlood(){
        System.out.println("通用加血");
    }
}

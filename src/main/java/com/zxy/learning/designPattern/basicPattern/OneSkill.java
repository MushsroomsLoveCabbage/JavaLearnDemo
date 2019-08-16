package com.zxy.learning.designPattern.basicPattern;


public class OneSkill extends AbstractSkill{

    @Override
    public void freed() {
        System.out.println("One skill freed");
        commonAddBlood();
    }
}

package com.zxy.learning.designPattern.Builder;

/**
 * @author zxy
 * @version 1.0.0
 * @ClassName BuilderTest.java
 * @Description 建造者模式，可以用来结构化生成特定对象，隐藏对象生成细节
 * @createTime 2019年08月17日 01:58:00
 */
public class BuilderTest {

    public static void main(String[] args){

        Product product = ProductBuilder.newBuilder()
                .setX(100)
                .setY(1000)
                .setZ(10000)
                .build();

    }

}

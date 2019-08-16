package com.zxy.learning.designPattern.Builder;

import com.zxy.learning.disruptor.Producer;

/**
 * 建造者模式， 可以增加对象属性校验（玩家姓名有没有填），动态生成关联属性（玩家生日->玩家星座）
 * @author zxy
 * @version 1.0.0
 * @ClassName ProductBuilder.java
 * @Description Builder
 * @createTime 2019年08月17日 01:35:00
 */
public class ProductBuilder {

    private int x;

    private int y;

    private int z;

    public ProductBuilder setX(int x){
        this.x = x;
        return this;
    }

    public ProductBuilder setY(int y){
        this.y = y;
        return this;
    }

    public ProductBuilder setZ(int z){
        this.z = z;
        return this;
    }

    public Product build(){
        Product result = buildPart();
        return result;
    }

    private Product buildPart(){
        Product result = new Product();
        result.setX(x);
        result.setY(y);
        result.setZ(z);
        return result;
    }

    public static ProductBuilder newBuilder(){
        return new ProductBuilder();
    }
}

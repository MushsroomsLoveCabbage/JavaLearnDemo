package com.zxy.learning.disruptor;

import com.lmax.disruptor.EventFactory;
import com.lmax.disruptor.EventHandler;
import com.lmax.disruptor.WorkHandler;

/**
 * @author zxy
 * @version 1.0.0
 * @ClassName OrderHandler.java
 * @Description TODO
 * @createTime 2019年03月05日 16:17:00
 */
public class OrderHandler implements EventHandler<Order>, WorkHandler<Order> {

    private String consumerId;

    public OrderHandler(String consumerId) {
        this.consumerId = consumerId;
    }

    @Override
    public void onEvent(Order order, long sequence, boolean endOfBatch) throws Exception {
        System.out.println(sequence + "orderHandler" + this.consumerId + ",消费信息:" + order.getId());
    }

    @Override
    public void onEvent(Order order) throws Exception {
        System.out.println("orderHandler" + this.consumerId + ",消费信息:" + order.getId());
    }
}

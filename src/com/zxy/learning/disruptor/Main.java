package com.zxy.learning.disruptor;

import com.lmax.disruptor.EventFactory;
import com.lmax.disruptor.RingBuffer;
import com.lmax.disruptor.YieldingWaitStrategy;
import com.lmax.disruptor.dsl.Disruptor;
import com.lmax.disruptor.dsl.ProducerType;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author zxy
 * @version 1.0.0
 * @ClassName Main.java
 * @Description TODO
 * @createTime 2019年03月05日 16:25:00
 */
public class Main {

    public static void main(String[] args) throws Exception{
        EventFactory<Order> orderFactory = new OrderFactory();
        int ringBufferSize = 1024 * 1024;
        Disruptor<Order> disruptor = new Disruptor<Order>(orderFactory, ringBufferSize, Executors.defaultThreadFactory(),
                ProducerType.SINGLE, new YieldingWaitStrategy());
        disruptor.handleEventsWith(new OrderHandler("1"));
        disruptor.start();
        RingBuffer<Order> ringBuffer = disruptor.getRingBuffer();
        Producer producer = new Producer(ringBuffer);
        for(int i = 0; i < 3; i++){
            producer.onData(i + "");
        }
        Thread.sleep(1000);
        disruptor.shutdown();
    }
}

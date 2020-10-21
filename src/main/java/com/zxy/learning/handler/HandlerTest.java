package com.zxy.learning.handler;

import com.zxy.learning.thread.waitAndnotify.Producer;

import java.util.HashMap;
import java.util.Map;

/**
 * 目的：实现一个多用户的顺序消息处理模型
 * 指标：1,不用用户消息顺序处理
 * 核心: 每个用户一个消息队列，并且用一个线程去循环消费消息
 * @author zxy
 * @version 1.0.0
 * @ClassName HandlerTest.java
 * @Description
 * @createTime 2020年10月21日 14:27:00
 */
public class HandlerTest {

    public static void main(String[] args) {
        new Thread(new MessageProducer(1, 0),"pro1").start();
        new Thread(new MessageProducer(1, 0),"pro1").start();
        new Thread(new MessageProducer(1, 0),"pro1").start();
        new Thread(new MessageProducer(2, 0),"pro1").start();
        new Thread(new MessageProducer(2, 0),"pro1").start();
        new Thread(new MessageProducer(2, 0),"pro1").start();
        new Thread(new MessageProducer(3, 0),"pro1").start();
        new Thread(new MessageProducer(3, 0),"pro1").start();
        new Thread(new MessageProducer(3, 0),"pro1").start();
        new Thread(new MessageProducer(4, 0),"pro1").start();
        new Thread(new MessageProducer(4, 0),"pro1").start();
        new Thread(new MessageProducer(4, 0),"pro1").start();
//        new Thread(new MessageProducer(2, 0),"pro1").start();
//        new Thread(new MessageProducer(3, 0),"pro1").start();
//        new Thread(new MessageProducer(4, 0),"pro1").start();
//        new Thread(new MessageProducer(5, 0),"pro1").start();
    }

}

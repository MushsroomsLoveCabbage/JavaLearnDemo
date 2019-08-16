//package com.zxy.learning.disruptor;
//
//import com.lmax.disruptor.EventTranslator;
//import com.lmax.disruptor.EventTranslatorVararg;
//import com.lmax.disruptor.RingBuffer;
//
///**
// * @author zxy
// * @version 1.0.0
// * @ClassName Producer.java
// * @Description TODO
// * @createTime 2019年03月05日 16:20:00
// */
//public class Producer {
//
//    private final RingBuffer<Order> ringBuffer;
//
//    private static final EventTranslatorVararg<Order> translator = new EventTranslatorVararg<Order>() {
//        @Override
//        public void translateTo(Order order, long l, Object... objects) {
//            order.setId((String)objects[0]);
//        }
//    };
//
//    public Producer(RingBuffer<Order> ringBuffer) {
//        this.ringBuffer = ringBuffer;
//    }
//
//    public void onData(String data){
//        long sequence = ringBuffer.next();
//        try{
//            Order order = ringBuffer.get(sequence);
//            order.setId(data);
//        } finally {
//            ringBuffer.publish(sequence);
//        }
//    }
//}

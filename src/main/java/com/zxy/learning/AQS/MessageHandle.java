package com.zxy.learning.AQS;

import java.util.concurrent.LinkedBlockingQueue;

public class MessageHandle {

    private static LinkedBlockingQueue subQueue = new LinkedBlockingQueue(10240);

    /**
     *
     */
    static class DispatchMessageTask implements Runnable {
        public void run() {
            //BlockingQueue<Message> subQueue;
            for (;;) {
                //如果没有数据，则阻塞在这里
//                Message msg = MsgQueueFactory.getMessageQueue().take();
//                //如果为空，则表示没有Session机器连接上来，
//                //需要等待，直到有Session机器连接上来
//                while ((subQueue = getInstance().getSubQueue()) == null) {
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        Thread.currentThread().interrupt();
//                    }
//                }
//                //把消息放到小队列里
//                try {
//                    subQueue.put(msg);
//                } catch (InterruptedException e) {
//                    Thread.currentThread().interrupt();
//                }
            }
        }
    }
}

package com.zxy.learning.concurrent;

import java.util.concurrent.CountDownLatch;

/**
 * CountDownLatch和CyclicBarrier都能够实现线程之间的等待，只不过它们侧重点不同：
 * CountDownLatch是不能够重用的，
 * CountDownLatch一般用于某个线程A等待若干个其他线程执行完任务之后，它才执行；
 * @author zxy
 * @version 1.0.0
 * @ClassName CountDownLatchTest.java
 * @Description
 * @createTime 2019年06月20日 10:39:00
 */
public class CountDownLatchTest {

    public static void main(String[] args){

        CountDownLatch countDownLatch = new CountDownLatch(5);

        for(int i = 0; i < 10; i++) {
            new Worker(countDownLatch).start();
        }
        try {
            System.out.println("5...");
            countDownLatch.await();
            System.out.println("5个子线程已经执行完毕");
            System.out.println("继续执行主线程");
        } catch (Exception e){

        }

    }

    static class Worker extends Thread{
        private CountDownLatch countDownLatch;

        public Worker(CountDownLatch countDownLatch) {
            this.countDownLatch = countDownLatch;
        }

        @Override
        public void run() {
            try {
                System.out.println("子线程"+Thread.currentThread().getName()+"正在执行");
                Thread.sleep(3000);
                System.out.println("子线程"+Thread.currentThread().getName()+"执行完毕");
                countDownLatch.countDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

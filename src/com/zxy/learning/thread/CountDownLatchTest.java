package com.zxy.learning.thread;

import java.util.concurrent.CountDownLatch;

/**
 * @author zxy
 * @version 1.0.0
 * @ClassName CountDownLatchTest.java
 * @Description 线程等待某些信号释放 不可重用
 * @createTime 2019年12月02日 16:54:00
 */
public class CountDownLatchTest {

    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(10);

        for(int i = 0; i < 9; i++){
            new Thread(()-> {
                System.out.println("start");
                countDownLatch.countDown();
            }).start();
        }

        new Thread(()-> {
            System.out.println("start 1");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("end 1");
            countDownLatch.countDown();
        }).start();

        new Thread(()->{
           System.out.println("1");
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("end");

        }).start();


    }
}

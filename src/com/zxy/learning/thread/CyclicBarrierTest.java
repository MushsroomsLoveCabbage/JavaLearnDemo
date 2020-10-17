package com.zxy.learning.thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author zxy
 * @version 1.0.0
 * @ClassName CyclicBarrierTest.java
 * @Description 一组线程都达到 栅栏点后继续执行
 * @createTime 2019年12月02日 16:11:00
 */
public class CyclicBarrierTest {

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(10,()->{
            System.out.println("barrierCommand");
        });

        for(int i = 0; i< 7; i++){
            new Thread(()->{
                System.out.println("start");
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
                System.out.println("end");
            }).start();
        }
        new Thread(()->{
            System.out.println("start omo");
            try {
                Thread.sleep(10000);
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println("end omo");
        }).start();

        new Thread(()->{
            System.out.println("start interrupt");
            try {
                Thread.sleep(1000);
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }


        }).start();


        new Thread(()->{
            System.out.println("start break");
            try {
                Thread.sleep(1000);
                //cyclicBarrier.reset();
                cyclicBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
            System.out.println("end break");
        }).start();
    }
}

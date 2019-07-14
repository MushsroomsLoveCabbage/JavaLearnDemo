package com.zxy.learning.concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * CyclicBarrier一般用于一组线程互相等待至某个状态，然后这一组线程再同时执行；
 * 而CyclicBarrier是可以重用的。
 * @author zxy
 * @version 1.0.0
 * @ClassName CyclicBarrierTest.java
 * @Description
 * @createTime 2019年06月19日 15:34:00
 */
public class CyclicBarrierTest {
    public static void main(String[] args){
        int number = 4;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(number, ()->{
            System.out.println("当前线程:" + Thread.currentThread().getName());
        });

        for(int i = 0; i < 10; i++){
            new Writer(cyclicBarrier).run();
        }
    }

    static class Writer extends Thread{

        private CyclicBarrier cyclicBarrier;

        public Writer(CyclicBarrier cyclicBarrier) {
            this.cyclicBarrier = cyclicBarrier;
        }

        @Override
        public void run() {
            System.out.println("线程"+Thread.currentThread().getName()+"正在写入数据...");
            try {
                //以睡眠来模拟写入数据操作
                Thread.sleep(5000);
                System.out.println("线程"+Thread.currentThread().getName()+"写入数据完毕，等待其他线程写入完毕");
                try {
                    cyclicBarrier.await(2000, TimeUnit.MILLISECONDS);
                } catch (TimeoutException e) {
                    e.printStackTrace();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }catch(BrokenBarrierException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"所有线程写入完毕，继续处理其他任务...");
        }
    }
}

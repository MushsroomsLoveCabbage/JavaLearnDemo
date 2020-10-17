package com.zxy.learning.thread;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author zxy
 * @version 1.0.0
 * @ClassName SemaphoreTest.java
 * @Description
 * @createTime 2019年12月02日 17:07:00
 */
public class SemaphoreTest {

    public static void main(String[] args) {
        new SemaphoreTest().print();
    }

    public  void test(){
        Semaphore semaphore = new Semaphore(15, true);
        //semaphore.getClass().getDeclaredField("");

        //Collections.sort();
        //Arrays.sort();

        for(int i = 0; i< 8; i++){
            new Thread(()->{
                try {
                    semaphore.acquire();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(1);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                semaphore.release();
            }).start();
        }
        for(int i = 0; i < 10; i++){
            new Thread(()->{
                try {
                    semaphore.acquire();
                    //Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(2);
                semaphore.release();
            }).start();
        }
    }
    public void print(){
        Semaphore semaphore = new Semaphore(1, true);
        //AtomicInteger  index = new AtomicInteger(1);
        Integer index = new Integer(1000);
        ExecutorService executorService = new ThreadPoolExecutor(4,16,1000, TimeUnit.SECONDS, new ArrayBlockingQueue<>(1024));;
        executorService.submit(new printIntegerJob(index, semaphore));

        executorService.submit(new printIntegerJob(index, semaphore));
    }
    class printIntegerJob implements Runnable{

        private Integer index;
        private Semaphore semaphore;
        public printIntegerJob(Integer index, Semaphore semaphore) {
            this.index = index;
            this.semaphore = semaphore;
        }

        @Override
        public void run() {
            while(index < 1100){
                try {
                    semaphore.acquire();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(index++);
                semaphore.release();
            }
        }
    }

    class printJob implements Runnable{

        private AtomicInteger index;
        private Semaphore semaphore;
        public printJob(AtomicInteger index, Semaphore semaphore) {
            this.index = index;
            this.semaphore = semaphore;
        }

        @Override
        public void run() {
            while(index.get() < 100){
                try {
                    semaphore.acquire();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(index.get());
                index.incrementAndGet();
                semaphore.release();
            }
        }
    }

}

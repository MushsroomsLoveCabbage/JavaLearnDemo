package com.zxy.learning.concurrent;

import java.util.concurrent.Semaphore;

/**
 * Semaphore其实和锁有点类似，它一般用于控制对某组资源的访问权限。
 * @author zxy
 * @version 1.0.0
 * @ClassName Semaphore.java
 * @Description
 * @createTime 2019年06月20日 10:25:00
 */
public class SemaphoreTest {

    public static void main(String[] args){

        Semaphore semaphore = new Semaphore(5);

        for(int i = 0; i < 10; i++){
            new worker(i, semaphore).start();
        }

    }

    static class worker extends Thread{

        private int num;

        private Semaphore semaphore;

        public worker(int num,Semaphore semaphore) {
            this.semaphore = semaphore;
            this.num = num;
        }

        @Override
        public void run() {
            try {
                semaphore.acquire();
                System.out.println("工人"+this.num+"占用一个机器在生产...");
                Thread.sleep(2000);
                System.out.println("工人"+this.num+"释放出机器");
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

package com.zxy.learning.asynchronized;

import java.util.concurrent.*;

/**
 * @author zxy
 * @version 1.0.0
 * @ClassName AsynchronizedDemo.java
 * @Description TODO
 * @createTime 2019年06月24日 10:38:00
 */
public class AsynchronizedDemo {

    public static void main(String[] args){

        ExecutorService executorService = new ThreadPoolExecutor(
                4,10,1000, TimeUnit.SECONDS, new ArrayBlockingQueue<>(1024));

        Future<String> future = executorService.submit(new Task());
        while(future.isDone()) {
            try {
                future.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            } finally {
            }
        }

        //CompletableFuture.supplyAsync(Task::getUser).thenAccept();
    }

    static class Task implements Callable<String> {
        @Override
        public String call() throws Exception {

            return "";
        }

        public static String getUser(){
            return "";
        }
    }

}

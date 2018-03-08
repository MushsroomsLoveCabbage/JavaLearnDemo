package com.zxy.learning.thread.pool;

import java.util.LinkedList;
import java.util.List;
/**
 * 线程池
* @ClassName: ThreadPool
* @Description: TODO(这里用一句话描述这个类的作用)
* @author zxy 1363320658@qq.com
* @date 2018年3月7日 下午6:39:10
*
 */
public final class ThreadPool {
	//线程池默认线程个数
	private static int worker_num = 5;
	//工作线程
	private MyThread[] workThread;
	//已处理的任务
	private static volatile int finished_task = 0;
	//任务队列，作为一个缓冲，List不安全 可以考虑并发List
	private List<Runnable> taskQueue = new LinkedList<Runnable>();
	private static ThreadPool threadPool;
	
	//创建具有默认线程数的线程池
	private ThreadPool(){
		this(5);
	}
	
	//创建线程池,worker_num为线程池中工作线程的个数  
	private ThreadPool(int num){
		ThreadPool.worker_num = num;
		workThread = new MyThread[num];
		for(int i = 0 ; i < num; i++) {
			workThread[i] = new MyThread();
			workThread[i].start();
		}
	}
	
	// 单态模式，获得一个默认线程个数的线程池  
	public static ThreadPool getThreadPool(){
		return getThreadPool(ThreadPool.worker_num);
	}
	
	// 单态模式，获得一个指定线程个数的线程池,worker_num(>0)为线程池中工作线程的个数  
    // worker_num<=0创建默认的工作线程个数  
	public static ThreadPool getThreadPool(int num){
		if(num  <= 0)
			num = ThreadPool.worker_num;
		if(threadPool == null) 
			threadPool = new ThreadPool(num);
		return threadPool;
	}
	
	public void execute(Runnable task){
		synchronized (task){
			taskQueue.add(task);
			taskQueue.notify();
		}
	}
	
	public void execute(Runnable[] task) {
		synchronized (taskQueue){
			for(Runnable obj : task) {
				taskQueue.add(obj);
			}
			taskQueue.notify();
		}
	}
	
	public void execute(List<Runnable> task) {  
        synchronized (taskQueue) {  
            for (Runnable t : task)  
                taskQueue.add(t);  
            taskQueue.notify();  
        }  
    } 
	
	public void destory(){
		while(!taskQueue.isEmpty()){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			for(int i = 0; i < worker_num ; i++ ){
				workThread[i].stopWorker();
				workThread[i] = null;
			}
			threadPool = null;
			taskQueue.clear();
		}
	}
	
	// 返回工作线程的个数  
    public int getWorkThreadNumber() {  
        return worker_num;  
    }  
  
    // 返回已完成任务的个数,这里的已完成是只出了任务队列的任务个数，可能该任务并没有实际执行完成  
    public int getFinishedTasknumber() {  
        return finished_task;  
    }  
  
    // 返回任务队列的长度，即还没处理的任务个数  
    public int getWaitTasknumber() {  
        return taskQueue.size();  
    }  
    
    // 覆盖toString方法，返回线程池信息：工作线程个数和已完成任务个数  
    @Override  
    public String toString() {  
        return "WorkThread number:" + worker_num + "  finished task number:"  
                + finished_task + "  wait task number:" + getWaitTasknumber();  
    }  
  
	
    /** 
     * 内部类，工作线程 
     */  
    private class MyThread extends Thread {  
        // 该工作线程是否有效，用于结束该工作线程  
        private boolean isRunning = true;  
  
        /* 
         * 关键所在啊，如果任务队列不空，则取出任务执行，若任务队列空，则等待 
         */  
        @Override  
        public void run() {  
            Runnable r = null;  
            while (isRunning) {// 注意，若线程无效则自然结束run方法，该线程就没用了  
                synchronized (taskQueue) {  
                    while (isRunning && taskQueue.isEmpty()) {// 队列为空  
                        try {  
                            taskQueue.wait(20);  
                        } catch (InterruptedException e) {  
                            e.printStackTrace();  
                        }  
                    }  
                    if (!taskQueue.isEmpty())  
                        r = taskQueue.remove(0);// 取出任务  
                }  
                if (r != null) {  
                    r.run();// 执行任务  
                }  
                finished_task++;  
                r = null;  
            }  
        }  
  
        // 停止工作，让该线程自然执行完run方法，自然结束  
        public void stopWorker() {  
            isRunning = false;  
        }  
    }  
	
	
	
}

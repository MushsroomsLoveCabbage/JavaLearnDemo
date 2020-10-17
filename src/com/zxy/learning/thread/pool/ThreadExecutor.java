package com.zxy.learning.thread.pool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/**
 * 线程池
 * 
 * 如果是CPU密集型任务，就需要尽量压榨CPU，参考值可以设为 NCPU+1
 * 如果是IO密集型任务，参考值可以设置为2*NCPU
* @ClassName: ThreadExecutor
* @Description:
* @author zxy 1363320658@qq.com
* @date 2018年3月7日 下午9:33:44
*
 */
public class ThreadExecutor {
	public static void main(String[] args) {
		//1）ArrayBlockingQueue：基于数组的先进先出队列，此队列创建时必须指定大小；
		//2）LinkedBlockingQueue：基于链表的先进先出队列，如果创建时没有指定此队列大小，则默认为Integer.MAX_VALUE；
		//3）synchronousQueue：这个队列比较特殊，它不会保存提交的任务，而是将直接新建一个线程来执行新来的任务。
		ThreadPoolExecutor tpe = new ThreadPoolExecutor(5, 10, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(100));
		//shutdown()：不会立即终止线程池，而是要等所有任务缓存队列中的任务都执行完后才终止，但再也不会接受新的任务
		//tpe.shutdown();
		//shutdownNow()：立即终止线程池，并尝试打断正在执行的任务，并且清空任务缓存队列，返回尚未执行的任务
		//tpe.shutdownNow();
		for (int i = 0; i < 15; i++) {
			MyTask myTask = new MyTask(i);
			tpe.execute(myTask);
			System.out.println("线程池中线程数目为:" + tpe.getPoolSize() + "队列中等待的数目" + tpe.getQueue().size() + "已经执行的数目" + tpe.getCompletedTaskCount());
		}

		tpe.shutdown();

	}
}

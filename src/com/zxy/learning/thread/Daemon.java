package com.zxy.learning.thread;

/**
 * Daemon 支持线程 
 * jvm 中不存在非Daemon 线程，虚拟机会退出
* @ClassName: Daemon
* @Description: TODO(这里用一句话描述这个类的作用)
* @author zxy 1363320658@qq.com
* @date 2018年3月8日 下午12:14:37
*
 */
public class Daemon {
	public static void main(String[] args){
		Thread thread =  new Thread(new Runner(), "thread");
		thread.setDaemon(true);
		thread.start();
		System.out.println("执行结束");
	}
	
	static class Runner implements Runnable{
		@Override
		public void run() {
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}finally{
				System.out.println("");
			}
		}
	} 
}

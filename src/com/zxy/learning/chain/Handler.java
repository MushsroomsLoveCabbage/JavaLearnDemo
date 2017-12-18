/**
 * Creation Date:2017年12月13日-下午2:12:30
 * 
 * 
 */
package com.zxy.learning.chain;

/**
 * 责任链模式
 * Description Of The Class<br/>
 * 
 * 
 * @author zxy
 * @Connect Mail:1363320658@qq.com
 * @version 1.0.0, 2017年12月13日-下午2:12:30
 * @since 2017年12月13日-下午2:12:30
 */
public abstract class Handler {
	protected Handler successor;
	public abstract void handleRequest();
	public Handler getSuccessor() {
		return successor;
	}
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}

}


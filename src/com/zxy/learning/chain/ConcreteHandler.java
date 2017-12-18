/**
 * Creation Date:2017年12月13日-下午2:14:37
 * 
 * 
 */
package com.zxy.learning.chain;

/**
 * Description Of The Class<br/>
 * 
 * 
 * @author zxy
 * @Connect Mail:1363320658@qq.com
 * @version 1.0.0, 2017年12月13日-下午2:14:37
 * @since 2017年12月13日-下午2:14:37
 */
public class ConcreteHandler extends Handler{

	@Override
	public void handleRequest() {
		if(getSuccessor() != null) {
		    System.out.println("放过请求");
		    getSuccessor().handleRequest();  
		} else {
			System.out.println("处理请求");
		}
		
	}

}


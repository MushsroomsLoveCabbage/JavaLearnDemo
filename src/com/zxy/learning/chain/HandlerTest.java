/**
 * Creation Date:2017年12月13日-下午2:20:46
 * 
 * 
 */
package com.zxy.learning.chain;

/**
 * 责任链模式
 * 如果有下一责任人，则交给下个责任人，否则自己处理！
 * Description Of The Class<br/>
 * 
 * 
 * @author zxy
 * @Connect Mail:1363320658@qq.com
 * @version 1.0.0, 2017年12月13日-下午2:20:46
 * @since 2017年12月13日-下午2:20:46
 */
public class HandlerTest {
	public static void main(String[] args) {
		//组装责任链
		Handler handler1 = new ConcreteHandler();
		Handler handler2 = new ConcreteHandler();
		handler1.setSuccessor(handler2);
		handler1.handleRequest();
	}
}


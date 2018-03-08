package com.zxy.learning.collection;

import java.util.AbstractQueue;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * 
* @ClassName: ConcurrentBasic
* @Description: TODO(这里用一句话描述这个类的作用)
* @author zxy 1363320658@qq.com
* @date 2018年3月8日 下午3:13:03
*
 */
public class ConcurrentBasic {
	public static void main(String[] args){
		Map<String, String> map = new ConcurrentHashMap<String, String>();
		AbstractQueue<String> queue = new ConcurrentLinkedQueue<String>();
	}
}

/**
 * Creation Date:2017年10月30日-下午5:12:07
 * 
 * Copyright 2010-2017 © 中格软件 Inc. All Rights Reserved
 */
package com.zxy.learning.cache;

/**
 * Description Of The Class<br/>
 * QQ:1363320658
 * 
 * @author 	赵翔宇
 * @version 1.0.0, 2017年10月30日-下午5:12:07
 * @since 2017年10月30日-下午5:12:07
 */
public class Cache {

	private String key; //缓存ID

	private Object val; //缓存数据

	private Long timeOut; //更新时间

	private boolean expired; //有效时长
	
	public Cache() {
		super();		
	}
	
	public Cache(String key, Object val, Long timeOut, boolean expired) {
		super();
		this.key = key;
		this.val = val;
		this.timeOut = timeOut;
		this.expired = expired;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Object getVal() {
		return val;
	}

	public void setVal(Object val) {
		this.val = val;
	}

	public Long getTimeOut() {
		return timeOut;
	}

	public void setTimeOut(Long timeOut) {
		this.timeOut = timeOut;
	}

	public boolean isExpired() {
		return expired;
	}

	public void setExpired(boolean expired) {
		this.expired = expired;
	}
	
}


/**
 * Creation Date:2017年12月7日-上午10:49:59
 * 
 * 
 */
package com.zxy.learning.spring.ioc;

import java.util.HashMap;
import java.util.Map;

/**
 * Description Of The Class<br/>
 * 
 * 
 * @author zxy
 * @Connect Mail:1363320658@qq.com
 * @version 1.0.0, 2017年12月7日-上午10:49:59
 * @since 2017年12月7日-上午10:49:59
 */
public class Bean {
	private String id;
	private String type;
	private Map<String,Object> properties = new HashMap<String,Object>();
	public Bean() {
		System.out.println("无参构造！");
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Map<String, Object> getProperties() {
		return properties;
	}
	public void setProperties(Map<String, Object> properties) {
		this.properties = properties;
	}
	
	
}


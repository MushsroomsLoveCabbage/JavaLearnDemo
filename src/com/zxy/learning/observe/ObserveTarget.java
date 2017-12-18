/**
 * Creation Date:2017年12月13日-下午4:06:09
 * 
 * 
 */
package com.zxy.learning.observe;

import java.util.Observable;

/**
 * Description Of The Class<br/>
 * 
 * 
 * @author zxy
 * @Connect Mail:1363320658@qq.com
 * @version 1.0.0, 2017年12月13日-下午4:06:09
 * @since 2017年12月13日-下午4:06:09
 */
public class ObserveTarget extends Observable{
	private float price;

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.setChanged();
		this.notifyObservers(price);
		this.price = price;
	}
	
	public ObserveTarget(float price) {
		this.price = price;
	}
	
}


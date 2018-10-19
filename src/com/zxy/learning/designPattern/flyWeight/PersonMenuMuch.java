package com.zxy.learning.designPattern.flyWeight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonMenuMuch implements Menu{
	private Map menuList = new HashMap();
	public PersonMenuMuch(){
		
	}
	public void add(String key, Menu menu){
		menuList.put(key, menu);
	}
	
	@Override
	public synchronized void setPersonMenu(String person, List list) {
		
		
	}

	@Override
	public List findPersonMenu(String person, List list) {
		List nothing = null;
		return nothing;
	}

}

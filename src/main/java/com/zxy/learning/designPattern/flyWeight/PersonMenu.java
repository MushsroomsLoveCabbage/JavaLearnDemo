package com.zxy.learning.designPattern.flyWeight;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PersonMenu implements Menu{
	private String dish;
	public PersonMenu(String dish){
		this.dish = dish;
	}
	
	@Override
	public synchronized void setPersonMenu(String person, List list) {
		list.add(person);
		list.add(dish);
		
	}

	@Override
	public List findPersonMenu(String person, List list) {
		List dishList  = new ArrayList();
		Iterator it = list.iterator();
		while(it.hasNext()) {
			if(person.equals((String)it.next()))
				dishList.add(it.next());
		}
		return dishList;
	}

}

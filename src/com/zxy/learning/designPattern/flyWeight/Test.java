package com.zxy.learning.designPattern.flyWeight;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
	private static FlyweightFactory factory;
	
	public static void main(String[] args){
		List list1 = new ArrayList();
		factory = FlyweightFactory.getInstance();
		Menu menu = factory.factory("food01");
		menu.setPersonMenu("p1", list1);
		menu = factory.factory("food02");
		menu.setPersonMenu("p1", list1);
		menu = factory.factory("food03");
		menu.setPersonMenu("p1", list1);
		menu = factory.factory("food04");
		menu.setPersonMenu("p1", list1);
		menu = factory.factory("food05");
		menu.setPersonMenu("p1", list1);
		menu = factory.factory("food06");
		menu.setPersonMenu("p1", list1);
		menu = factory.factory("food07");
		menu.setPersonMenu("p1", list1);
		System.out.println(factory.getNumber());
		List list2 = menu.findPersonMenu("p1", list1);
		Iterator it = list2.iterator();
		while(it.hasNext()) {
			System.out.println(" "+ it.next());
		}
	}

}

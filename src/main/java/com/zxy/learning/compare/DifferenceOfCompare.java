package com.zxy.learning.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *  == 与 equals的区别
 *  == 对象比较内存地址， 
 *  equals 比较 内存地址，如果不同，String 比较每个字符！
* @ClassName: DifferenceOfCompare
* @Description: TODO(这里用一句话描述这个类的作用)
* @author zxy 1363320658@qq.com
* @date 2017年12月26日 下午9:40:10
*
 */
public class DifferenceOfCompare {
	
	public static void main(String[] args){
		List<Long> list = new ArrayList<Long>();
		list.add(1L);
		list.add(10L);
		list.add(11L);
		list.add(11L);
		list.add(100L);
		list.add(1000000000L);	
		list.add(10L);
		list.add(1110L);
		list.add(130L);
		list.add(1150L);
		list.add(1000000000000000L); 
		list.add(10000L);
		 Collections.sort(list, new Comparator<Long>() {
	            @Override
	            public int compare(Long o1, Long o2) {
	                return (int) (o2- o1);
	            }
	        });
		 
		System.out.println(list.toString());
		String a = "123";	
		String b = a;
		String c = new String("123");		
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a.equals(c));
		System.out.println("123".equals(a));
		System.out.println(a.equals("123"));
		a = "21345";
		System.out.println(b);
		
		String test1 = "adc";
		String test2 = "adc";
		String test3 = new String("adc");
		String test4 = "ad" + "c";
		System.out.println(test1 == test2);
		System.out.println(test2 == test3);
		System.out.println(test3 == test4);
		System.out.println(test1 == test4);
		
	}
	public void CompareString(){
		String a = "abc";
		StringBuilder sb = new StringBuilder("sb");
		StringBuffer sf = new StringBuffer("sf");
		switch(a){
		case "abc" :
			StringBuilder newSb = new StringBuilder("123");
		case "efg" : 
			StringBuilder newtest = new StringBuilder("435");
		}
	}
	
	

	
	
}

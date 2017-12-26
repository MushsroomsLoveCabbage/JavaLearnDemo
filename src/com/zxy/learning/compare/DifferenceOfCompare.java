package com.zxy.learning.compare;

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
		
	}
	
}

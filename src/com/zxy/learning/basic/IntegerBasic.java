package com.zxy.learning.basic;
/**
 * java 整数相关基础知识点
 * @author Administrator
 *
 */
public class IntegerBasic {
	
	private static final int int_1000000 = 1_000_000; //100W的方便阅读写法
	public static void main(String[] args){
	/*	Integer a = new Integer(3);
		Integer.valueOf(a);*/
		
		useBinaryIntegerLiteral();
	}
	
	/**
	 * 二进制表达整数
	 */
	public static void useBinaryIntegerLiteral() {
		int int_2 = 0b10;
		int int_10 = 0b1010;
		System.out.println(int_2 +"---------"+ int_10);
	}
	
}

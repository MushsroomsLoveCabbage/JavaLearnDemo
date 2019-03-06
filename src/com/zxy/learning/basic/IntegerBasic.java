package com.zxy.learning.basic;
/**
 * java 整数相关基础知识点
 * @author Administrator
 *
 */
public class IntegerBasic {

	//100W的方便阅读写
	private static final int int_1000000 = 1_000_000;

	//8进制表达方式 0
	private static final int int_8_8 = 010;

	//2进制表达方式  0B/0b
	private static final int int_2_2 = 0b10;

	//16进制表达方式  0X/0x
	private static final int int_16_16 = 0x10;

	public static void main(String[] args){
	/*	Integer a = new Integer(3);
		Integer.valueOf(a);*/
		String lng = null;
		String lat = "";
		//Double.parseDouble(lng);
		//Double.parseDouble(lat);
		useBinaryIntegerLiteral();
	}
	
	/**
	 * 二进制表达整数
	 */
	public static void useBinaryIntegerLiteral() {
		int int_2 = 0b10;
		int int_10 = 0b1010;
		System.out.println(int_8_8 +"---------"+ int_10);
		System.out.println(int_2_2 +"---------"+ int_10);
		System.out.println(int_16_16 +"---------"+ int_10);

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
	}
	
	
	
}

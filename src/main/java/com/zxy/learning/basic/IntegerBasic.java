package com.zxy.learning.basic;

import java.util.*;

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
		//useBinaryIntegerLiteral();
		//testForceCast();
		//testCompare();
		test(160);
	}
	    //11001101001011111010001000000000
		//10110010110100000101111000000000
	public static void testForceCast(){
		System.out.println((int)1000000000L);
		System.out.println((int)2000000000L);
		System.out.println(0b11101110011010110010100000000000);
		System.out.println((int)4000000000L);
	}

	public static int test(int n){
		int r = 0;      // Becomes 1 if any 1 bits are shifted off
		while (n >= 32) {
			r |= (n & 1);
			n >>= 1;
		}
		return n + r;
	}

	public static void testCompare(){
		Integer[] array = { 0, 0, 0, 0,   0, 0, 0, 3,   0, 0, 0, 0,   0, 0, 0, 0,     0, 0, 0, 0,
						    0, 0, 0, 0,   0, 0, 0, 0,   0, 0, 0, 0,   0, 0, 0, 0,     0, 0, 0, 0,
				            1, 0, 0, 1,   0, 1, 0, 0,   0, 0, 1, 0,   0, 1, 0, 0,     0, 1, 0, 0,
				            2, 1, 0, 0,   0, 2, 3, 0,   3, 0, 0, 0,   3, 0, 0, 0,     3, 0, 0, 0,
				            0, 0, 0, 0,   0, 0, 0, 3,   0, 0, 0, 0,   0, 0, 0, 0,     0, 0, 0, 0,
				            0, 0, 0, 0,   0, 0, 0, 3,   0, 0, 0, 0,   0, 0, 0, 0,     0, 0, 0, 0,
				            0, 0, 0, 0,   0, 0, 0, 3,   0, 0, 0, 0,   0, 0, 0, 0,     0, 0, 0, 0,
				            0, 0, 0, 0,   0, 0, 0, 3,   0, 0, 0, 0,   0, 0, 0, 0,     0, 0, 0, 0,
		               		0, 0, 0, 0,   0, 0, 0, 3,   0, 0, 0, 0,   0, 0, 0, 0,     0, 0, 0, 0,
				            0, 0, 0, 0,   0, 0, 0, 3,   0, 0, 0, 0,   0, 0, 0, 0,     0, 0, 0, 0,
		};
		List<Integer> list = Arrays.asList(array);
		list.forEach((temp)->{

		});
		// Collections.sort(list, (o1, o2) -> ((int) (o2 - o1)));
		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				System.out.println("o1:" + o1 + ", o2:" + o2 + ", :" + (int) (o1 - o2));
				return(int) (o1 - o2);
			}
		});
		System.out.println("+++++++++");
		System.out.println(list.toString());
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

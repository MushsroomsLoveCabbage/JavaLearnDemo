/**
 * Creation Date:2017年10月31日-下午2:45:35
 * 
 * Copyright 2010-2017 © 中格软件 Inc. All Rights Reserved
 */
package com.zxy.learning.utils;

import java.util.Arrays;

/**
 * Description Of The Class<br/>
 * QQ:1363320658
 * 
 * @author 	赵翔宇
 * @version 1.0.0, 2017年10月31日-下午2:45:35
 * @since 2017年10月31日-下午2:45:35
 */
public class Tools {
	
	/**
	 * 查找当前int 值是否 在数组当中
	 * 
	 * @author 	赵翔宇
	 * @version 1.0.0, 2017年8月5日-下午3:16:21
	 * @param i
	 * @param array
	 * @return Boolean
	 */	
	public Boolean isHave(int i, int[] array){
		Arrays.sort(array);
		int startIndex = 0;
		int endIndex = array.length;
		while(startIndex <= endIndex){
			int midIndex = (startIndex+endIndex)/2;
			int midVal = array[midIndex];
			if(i > midVal){
				startIndex = midIndex +1;
			}else if(i<midVal){
				endIndex = midIndex-1;
			}else{
				return true;
			}
		}
		return false;
	}
	
	
}


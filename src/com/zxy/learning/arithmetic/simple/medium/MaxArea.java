package com.zxy.learning.arithmetic.simple.medium;

/**
 * @author zxy
 * @version 1.0.0
 * @ClassName MaxArea.java
 * @Description TODO
 * @createTime 2019年03月11日 17:16:00
 */
public class MaxArea {

    public static int maxArea(int[] height){
        int result = 0;
        for(int index = 0; index < height.length - 1 ; index ++){
            for(int j = index + 1; j < height.length; j++ ){
                result = Math.max(Math.min(height[index], height[j])*(j-index), result);
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] array = {1,8,3,4,5,6,7,8,9,20,8,8,8,8,8,8,8};
        System.out.println( maxArea(array));
    }

}

package com.zxy.learning.arithmetic.simple;

/**
 * @author zxy
 * @version 1.0.0 从最后开始赋值。
 * @ClassName MergeTwoArray.java
 * @Description TODO https://leetcode-cn.com/problems/merge-sorted-array/
 * @createTime 2019年03月06日 10:19:00
 */
public class MergeTwoArray {

    public static void main(String[] args){
        int[] array1 = {1,3,5,7,9,11,13,15,0,0,0,0,0,0,0,0};
        int m = 8;
        int[] array2 = {0,2,4,6,8,10,12,14};
        int n = 8;
        array1 = merge(array1, m, array2, n);
        for(int i = 0; i < array1.length; i++){
            System.out.println(array1[i]);
        }
    }

    public static int[] merge(int[] array1, int m, int[] array2, int n){
        int index = m-- + n-- -1;
        while(m >= 0 && n >= 0){
            array1[index--] = array2[n] > array1[m] ? array2[n--] : array1[m--];
        }
        while(n >= 0){
            array1[index--] =  array2[n--];
        }
        return array1;
    }
}

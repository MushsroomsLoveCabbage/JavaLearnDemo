package com.zxy.learning.sort;

import java.util.Arrays;

/**
 * 插入排序：
 * 核心思想，每个新元素和前面比较，直到找到合适位置
 */
public class InsertSort {
    public static void main(String[] args){
        int array[] = new int[]{3,1,5,2,4,8,6,9,7,10};

        array = insertSort(array);

    }


    public static int[] insertSort(int[] array){
        int length = array.length;
        if(length == 1){
            return array;
        }
        for(int i = 1; i < length; i++){
            for(int j = i ; j > 0; j--){
                if(array[j-1] > array[j]) {
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        return array;
    }

}

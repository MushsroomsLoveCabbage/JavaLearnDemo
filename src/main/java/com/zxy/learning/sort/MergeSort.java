package com.zxy.learning.sort;

import java.util.Arrays;

/**
 * 归并排序
 */
public class MergeSort {

    public static void main(String[] args){
        int array[] = new int[]{3,1,5,2,4,8,6,9,7,10,15,11,17,22,18,30};

        array = mergeSort(array);
        //array = sort(array, 0, array.length - 1);
        int i = array.length;
    }

    public static int[] sort(int[] array, int low, int high){
        int middle = (low + high)/2;
        if(low < high){
            sort(array, low, middle);
            sort(array, middle+1, high);
            merge(array,low, middle, high);

        }
        return array;
    }

    public static int[] merge(int[] array, int low, int middle, int high){
        int j = middle + 1;
        while (low <= middle && j <= high){
            if(array[low] > array[j]) {
                int temp = array[low];
                array[low] = array[j];
                array[j] = temp;
            }
            low++;
        }

        return array;
    }



    public static int[] mergeSort(int[] array){
        int length = array.length;
        if(length <= 1){
            return array;
        }
        int middle = length/2;
        int[] arrayLeft = Arrays.copyOfRange(array,0, middle);
        int[] arrayRight = Arrays.copyOfRange(array, middle, length );
        return merge(mergeSort(arrayLeft), mergeSort(arrayRight));
    }

    public static int[] merge(int[] arrayLeft, int[] arrayRight){
        int i = 0, j = 0, k = 0;
        int[] result = new int[arrayLeft.length+arrayRight.length];
        while (i < arrayLeft.length && j< arrayRight.length){
            if(arrayLeft[i] <= arrayRight[j]){
                result[k++] = arrayLeft[i++];
            } else {
                result[k++] = arrayRight[j++];
            }
        }
        while (i < arrayLeft.length){
            result[k++] = arrayLeft[i++];
        }
        while (j < arrayRight.length) {
            result[k++] = arrayRight[j++];
        }
        return result;
    }
}

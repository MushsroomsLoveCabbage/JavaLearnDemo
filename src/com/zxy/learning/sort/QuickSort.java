package com.zxy.learning.sort;
/**
 * 快速排序
 * 分治法来处理数据，大序列分为小序列来处理
 * 步骤
 *   1) 随机挑一个数做为基准（可以默认选中间值）
 *   2) 然后把小于这个的放前面，大于这个的放后面，相同数可在任意一边，这个操作称为分区，分区操作后的基准元素所处的位置就是排序后的最终位置
 *   3) 对基准两边的小序列重复1)2)步骤，直到序列只剩下一个元素
 * 参考链接: https://en.wikipedia.org/wiki/Quicksort
 * @author Administrator
 *
 */
public class QuickSort {
	public static void main(String[] args) {
		int []arr= {4,35,6576,878,1,23,5,7};
		quickSort(arr,0,arr.length-1);
	}
	
	private static void quickSort(int []arr,int l,int r) {
		if(l<r) {
			swap(arr,l+(int)(Math.random()*(r-l+1)),r);//随机快排挑选数组内一个随机的数，把它换到数组的最后位置
			int []p=partition(arr,l,r);
			quickSort(arr,l,p[0]-1);
			quickSort(arr,p[1]+1,r);		
		}			
	}	
	//左右分区
	private static int[] partition(int[] arr, int l, int r) {
		int less=l-1;
		int more=r;
		while(l<more) {
			if(arr[l]<arr[r]) {
				swap(arr,++less,l++);	
			}else if(arr[l]>arr[r]) {
				swap(arr,more--,l);
			}else {
				l++;
			}
		}
		swap(arr,more,r);//之在之前把这个数换到了最末尾都是以这个数为基准的现在要把它换回来，
		return new int[] {less+1,more};
		
	}
	//元素交换位置	
	private static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
}

package com.zxy.learning.sort;
/**
 * ��������
 * ���η����������ݣ������з�ΪС����������
 * ����
 *   1) �����һ������Ϊ��׼������Ĭ��ѡ�м�ֵ��
 *   2) Ȼ���С������ķ�ǰ�棬��������ķź��棬��ͬ����������һ�ߣ����������Ϊ����������������Ļ�׼Ԫ��������λ�þ�������������λ��
 *   3) �Ի�׼���ߵ�С�����ظ�1)2)���裬ֱ������ֻʣ��һ��Ԫ��
 * �ο�����: https://en.wikipedia.org/wiki/Quicksort
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
			swap(arr,l+(int)(Math.random()*(r-l+1)),r);//���������ѡ������һ���������������������������λ��
			int []p=partition(arr,l,r);
			quickSort(arr,l,p[0]-1);
			quickSort(arr,p[1]+1,r);		
		}			
	}	
	//���ҷ���
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
		swap(arr,more,r);//֮��֮ǰ���������������ĩβ�����������Ϊ��׼������Ҫ������������
		return new int[] {less+1,more};
		
	}
	//Ԫ�ؽ���λ��	
	private static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
}

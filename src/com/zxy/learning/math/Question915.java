package com.zxy.learning.math;

public class Question915 {

	public static void main(String[] args) {
		int[] A = { 5, 0, 3, 4, 2, 5, 1, 9, 6, 8 };
		partitionDisjoint(A);
	}

	public static int partitionDisjoint(int[] A) {
		int length = A.length;
		int max = A[0];
		int min = A[length - 1];
		int[] maxArray = new int[length];
		int[] minArray = new int[length];
		for (int i = 0; i < length; i++) {
			if (max <= A[i]) {
				max = A[i];				
			}
			maxArray[i] = max;
			if (A[length - 1 - i] <= min) {
				min = A[length - 1 - i];				
			}
			minArray[length - 1 - i] = min;
		}
		int result = 0;
		for (int i = 0; i < length; i++) {
			System.out.println(maxArray[i] +"----------"+ minArray[i]);
			if (minArray[i+1] >= maxArray[i]) {
				result = i;
				break;
			}
		}
		System.out.println(result);
		return result;
	}

}
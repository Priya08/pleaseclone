package com.bayamp.java.package1;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 3 };
		arr = removeDuplicates(arr);
		System.out.println(arr.length);

	}
	public static int[] removeDuplicates(int[] A) {
		if (A.length < 2)
			return A;
	 
		int j = 0;
		int i = 1;
	 
		while (i < A.length) {
			if (A[i] == A[j]) {
				i++;
			} else {
				j++;
				A[j] = A[i];
				i++;
			}
		}
	 
		int[] B = Arrays.copyOf(A, j + 1);
	 
		return B;
	}

}

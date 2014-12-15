package com.bayamp.java.package1;

import java.util.Arrays;
import java.util.Scanner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BubbleSort {
@Test
	 public static void main(String []args) {
		    int n, c, d, swap;
		    Scanner in = new Scanner(System.in);
		 
		    System.out.println("Input number of integers to sort");
		    n = in.nextInt();
		 
		    int array[] = new int[n];
		 
		    System.out.println("Enter " + n + " integers");
		 
		    for (c = 0; c < n; c++) 
		      array[c] = in.nextInt();
		 
		    for (c = 0; c < ( n - 1 ); c++) {
		      for (d = 0; d < n - c - 1; d++) {
		        if (array[d] > array[d+1]) /* For descending order use < */
		        {
		          swap       = array[d];
		          array[d]   = array[d+1];
		          array[d+1] = swap;
		        }
		      }
		    }
		 
		    System.out.println("Sorted list of numbers");
		 
		    for (c = 0; c < n; c++) 
		      System.out.println(array[c]);
		  }
	 @BeforeTest
	 public static void existingSort(){
		 int number[] = {4, -5, 2, 6,1};
		 Arrays.sort(number);
		 for (int c:number)
		 {
			 System.out.println(c);
		 }
		 
	 }
}

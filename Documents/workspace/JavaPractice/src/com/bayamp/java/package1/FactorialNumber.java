package com.bayamp.java.package1;

import java.util.Scanner;

import org.testng.annotations.Test;

public class FactorialNumber {
	 
	
	@Test
	public void factorialIteration(){
		
		 
	      System.out.println("Enter an integer to calculate it's factorial");
	     
	      int n, c, fact = 1;
	 	 Scanner in = new Scanner(System.in);
	 	 n= in.nextInt();
	     
	 in.close();
	      if ( n <= 0 )
	         System.out.println("invalid number.");
	      else
	      {
	         for ( c = 1 ; c <= n ; c++ )
	            fact = fact*c;
	 
	         System.out.println("Factorial of "+n+" is = "+fact);	
	      }
	
	}
	@Test
	public void factorialRecursion(){
		
		Scanner in = new Scanner(System.in);
	      System.out.println("Enter the number:");
	      //Stored the entered value in variable
	      int num = in.nextInt();
	      in.close();
	      //Called the user defined function fact
	      int factorial = fact(num);
	      System.out.println("Factorial of entered number is: "+factorial);
	   }
	   static int fact(int n)
	   {
	       int output;
	       if(n==1){
	         return 1;
	       }
	       //Recursion: Function calling itself!!
	       output = fact(n-1)* n;
	       return output;
	}
	
}

package com.bayamp.java.package1;

import org.testng.annotations.Test;



public class Shufflel1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3;
		while(x>0){
			if(x>2){
				System.out.print("a");
				x= x-1;
				System.out.print("-");
				
			}
			if(x==2){
				System.out.print("b c");
				x= x-1;
				System.out.print("-");
			}
			if (x==1){
				System.out.print("d");
				x= x-1;
			}
		}

	}
	@Test
	public static void test(){
		
		int x= 5;
		while(x>1){
			x= x-1;
			if (x<3){
				System.out.println("x value"+ x);
			}
			System.out.println("x value out of if condition"+ x);
		}
	}
}

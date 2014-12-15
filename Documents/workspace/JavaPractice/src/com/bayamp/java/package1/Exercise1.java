package com.bayamp.java.package1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1;
		while(x<10){
			x= x+1;
			if(x>3){
				System.out.println("x in the condition "+ x);
				
			}
			System.out.println("x in the while loop "+ x);
		}
		

	}
	@Test
	public static void test(){
		int x=5;
		while(x>1){
			x= x-1;
			if(x<3){
				System.out.println("x in the condition "+ x);
			}
			System.out.println("x in the while loop "+ x);
		}
		
	}
	@BeforeTest
	public static void poolpuzzle(){
		int x= 0;
		while(x<4){
			if(x<1){
				System.out.print("a");
				x= x+1;
			}
			if(x>0){
				System.out.print(" "+ "noise");
			}
			if(x==1){
				System.out.println(" annoys");
				x=x+1;
			}
			
			if(x>1){
				System.out.print(" an");
				x=x+2;
			}
			System.out.println(" oyster");
		}
		
	}
}

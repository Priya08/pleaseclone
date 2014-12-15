package com.bayamp.java.package1;

public class BeerCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int beerNum = 99;
		String word = "bottles";
		while (beerNum > 0) {
			if (beerNum == 1) {
					word = "bottle";
			}
		if(beerNum>0){
			System.out.println(beerNum+" "+ word+"of beer on the wall");
			System.out.println("Take one down") ;
			System .out .println( "Pass it around. ") ;
			beerNum = beerNum - 1;
					
		}
		
		
		}
		

		
			System.out.println("No more beer on the wall");
	
	}

}

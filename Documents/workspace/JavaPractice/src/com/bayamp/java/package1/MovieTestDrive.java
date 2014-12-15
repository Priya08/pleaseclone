package com.bayamp.java.package1;

public class MovieTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie one = new Movie();
		one.title = "Gone with the Stock";
		one.generic = "Tragic";
		one.rating = 2;
		one.playIt();
		Movie two = new Movie();
		two.title = "Lost in Cubical Space";
		two.generic = "Comedy";
		two.rating= 5;
		two.playIt();
		Movie three = new Movie();
		three.title = "Byte Club";
		three.generic = "Tragic but ultimately uplifting";
		three.rating = 187;
		three.playIt();
	}

}

package com.bayamp.java.package1;

import java.util.Scanner;
import java.util.StringTokenizer;


public class ReverseString {

	public static void main(String[] args) {
		String original, reverse = "";
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a string to reverse");
		original = in.nextLine();

		int length = original.length();

		for ( int i = length - 1 ; i >= 0 ; i-- )
			reverse = reverse + original.charAt(i);

		System.out.println("Reverse of entered string is: "+reverse);
		reverseUsingStringBuffer();
		stringReversewithStringTokenizer();

	}

	public static void reverseUsingStringBuffer(){
		StringBuffer a = new StringBuffer ("apples bananas kiwi");
		System.out.println(a.reverse());
	}

	public static void stringReversewithStringTokenizer(){
		String s = "bayamp Code Geeks - Java String Reverse example";
		StringTokenizer st = new StringTokenizer(s);
		String sReversed = "";
		while (st.hasMoreTokens()) {
			sReversed = st.nextToken() + " " + sReversed;
		}
		System.out.println("Original string is : " + s);

		System.out.println("Reversed string is : " + sReversed);

	}
}

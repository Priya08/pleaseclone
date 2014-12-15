package com.bayamp.java.package1;

import org.testng.annotations.Test;

public class Palindrome {
	@Test
	public static boolean isPalindrome(String strBuf1) {

		boolean palindrome = false;

		StringBuffer strBuf2 = new StringBuffer(strBuf1);

		strBuf2.reverse();

		System.out.println(strBuf2);

		// System.out.println((strBuf1.toString()).equals(strBuf2.toString()));

		if ((strBuf1.toString()).equals(strBuf2.toString()))

			palindrome= true;

		//			System.out.println("Its a palindrome");

		//			else

		//			System.out.println("Not a palindrome");

		return palindrome;


	}
}

package com.codingbat.string2;

public class DoubleChar {

	
	/*
	 * Given a string, return a string where for every char in the original, there are two chars.
	 *	doubleChar("The") -> "TThhee"
	 *  doubleChar("AAbb") -> "AAAAbbbb"
	 *  doubleChar("Hi-There") -> "HHii--TThheerree"
	 */
	public static String doubleChar(String str) {
		String doubleChar = "";
		  for(int i=0;i<str.length();i++) {
		    doubleChar+= (str.charAt(i)+""+str.charAt(i));
		  }
		  return doubleChar;
	}
	
}

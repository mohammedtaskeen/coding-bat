package com.codingbat.string2.src;

public class OneTwo {

	/**
	 * Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca". 
	 * Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.
	 * oneTwo("abc") -> "bca"
	 * oneTwo("tca") -> "cat"
	 * oneTwo("tcagdo") -> "catdog"
	 */
	public static String oneTwo(String str) {
		  if(str==null ) return str;
		  String oneTwo = "";
		  for(int i=0;i<str.length()-str.length()%3;i=i+3) {
		    oneTwo+=str.substring(i+1,i+3) + str.charAt(i);
		  }
		  /*if(str.length()%3 > 0) {
		    oneTwo+=str.substring(str.length()-str.length()%3, str.length());
		  }*/
		  return oneTwo;
		}
	
}

package com.codingbat.string2.src;

public class StarOut {

	/**
	 * Return a version of the given string, where for every star (*) in the string the star and the chars 
	 * immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
	 * starOut("ab*cd") -> "ad"
	 * starOut("ab**cd") -> "ad"
	 * starOut("sm*eilly") -> "silly"
	 */
	public static String starOut(String str) {
		  StringBuilder sb = new StringBuilder("");
		  for(int i = 0; i < str.length(); i++) {
		    int left = (i >= 1) ? i - 1 : i;
		    int right = (i < str.length() - 1) ? i + 1 : i;
		    if(str.charAt(left) != '*' && str.charAt(right) != '*' && str.charAt(i) != '*') {
		      sb.append(str.charAt(i));
		  }
		  }
		  return sb.toString();
		}
	
}

package com.codingbat.string2.src;

public class StarOut {

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

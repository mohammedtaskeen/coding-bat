package com.codingbat.recursion1.src;

public class CountHi2 {
	
	/**
	 * Given a string, compute recursively the number of times lowercase "hi" appears in the string, 
	 * however do not count "hi" that have an 'x' immediately before them.
	 * countHi2("ahixhi") -> 1
	 * countHi2("ahibhi") -> 2
	 * countHi2("xhixhi") -> 0
	 */
	public static int countHi2(String str) {
		if(str.length()<2) return 0;
		if(str.length()==2) {
			if(str.equals("hi")) return 1;
			else return 0;
		}
		
		if(str.substring(0,2).equals("hi")) {
			return 1+countHi2(str.substring(2,str.length()));
		} else if(str.charAt(0)=='x' && str.substring(1,3).equals("hi")) {
			return countHi2(str.substring(3,str.length()));
		} else if(str.substring(1,3).equals("hi")) {
			return 1+countHi2(str.substring(3,str.length()));
		} else {
			return countHi2(str.substring(1,str.length()));
		}
	}

}

package com.codingbat.string2.src;


/*
 * Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.
	sameStarChar("xy*yzz") -> true
	sameStarChar("xy*zzz") -> false
	sameStarChar("*xa*az") -> true
 */
public class SameStarChar {
	
	public static boolean sameStarChar(String str) {
		if(str==null) return false;
		if(str.length()==0) return true;
		if(str.length()==1 && str.charAt(0)=='*')	return true;
		for(int i=1;i<str.length()-1;i++) {
			if(str.charAt(i)=='*') {
				if(str.charAt(i-1) != str.charAt(i+1)) 
					return false;
			} else continue;
		}
		
		return true;
	}

}

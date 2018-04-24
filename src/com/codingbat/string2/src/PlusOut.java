package com.codingbat.string2.src;

public class PlusOut {

	/**
	 * Given a string and a non-empty word string, return a version of the original String 
	 * where all chars have been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.
	 * plusOut("12xy34", "xy") -> "++xy++"
	 * plusOut("12xy34", "1") -> "1+++++"
	 * plusOut("12xy34xyabcxy", "xy") -> "++xy++xy+++xy"
	 */
	public static String plusOut(String str, String word) {
		  if(str==null||str.length()<word.length()) return str;
		  String plusOut="";
		  int i=0;
		  for(;i<str.length()-word.length();i++) {
		    if(str.substring(i,i+word.length()).equals(word)) {
		      plusOut+=word;
		      i+=word.length()-1;
		    }
		    else {
		      plusOut+="+";
		    }
		  }
		  if(str.substring(str.length()-word.length(),str.length()).equals(word)) {
		    plusOut+=word;
		  } else {
		    for(int j=i;j<str.length();j++) {
		      plusOut+="+";
		    } 
		  }
		  
		  return plusOut;
		}

}

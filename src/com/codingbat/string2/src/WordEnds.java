package com.codingbat.string2.src;

public class WordEnds {

	/**
	 * Given a string and a non-empty word string, return a string made of each char just before 
	 * and just after every appearance of the word in the string. 
	 * Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.
	 * wordEnds("abcXY123XYijk", "XY") -> "c13i"
	 * wordEnds("XY123XY", "XY") -> "13"
	 * wordEnds("XY1XY", "XY") -> "11"
	 */
	public static String wordEnds(String str, String word) {
		  int slen = str.length();
		  int wlen = word.length();
		  String fin = "";
		  
		  for (int i = 0; i < slen-wlen+1; i++) { 
		    String tmp = str.substring(i,i+wlen);
		    if (i > 0 && tmp.equals(word))
		      fin += str.substring(i-1,i);
		    if (i < slen-wlen && tmp.equals(word))
		      fin += str.substring(i+wlen,i+wlen+1);
		  }
		  return fin;
		}

}

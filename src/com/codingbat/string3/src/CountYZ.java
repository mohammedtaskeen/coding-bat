package com.codingbat.string3.src;

public class CountYZ {
	
	
	/**
	 * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, 
	 * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic letter 
	 * immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
	 * countYZ("fez day") -> 2
	 * countYZ("day fez") -> 2
	 * countYZ("day fyyyz") -> 2
	 */
	public static int countYZ(String str) {
		  if(str==null||str.length()==0) return 0;
		  int countYZ=0;
		  for(int i=0;i<str.length();i++) {
		    boolean isNextCharLetter=i+1<str.length()?Character.isLetter(str.charAt(i+1)):false;
		    char currChar=str.charAt(i);
		    if((Character.toLowerCase(currChar)=='y'||Character.toLowerCase(currChar)=='z')&&!isNextCharLetter)
		      countYZ++;
		  }
		  return countYZ;
		}


}

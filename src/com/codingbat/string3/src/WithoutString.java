package com.codingbat.string3.src;

public class WithoutString {

	/**
	 * Given two strings, base and remove, return a version of the base string where all instances 
	 * of the remove string have been removed (not case sensitive). You may assume that the remove string is length 1 or more. 
	 * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
	 * withoutString("Hello there", "llo") -> "He there"
	 * withoutString("Hello there", "e") -> "Hllo thr"
	 * withoutString("Hello there", "x") -> "Hello there"
	 */
	public static String withoutString(String base, String remove) {
		int baseLen=base.length(),removeLen=remove.length();
		String withoutString="";
		if(baseLen<removeLen) return base;
		int i=0;
		for(;i<baseLen-removeLen;i++) {
			if(base.substring(i, i+removeLen).equalsIgnoreCase(remove)) {
				i+=removeLen-1;
			} else {
				withoutString+=base.charAt(i)+"";
			}
		}
		if(base.substring(i, baseLen).equalsIgnoreCase(remove))
			return withoutString;
		else return withoutString+base.substring(i, baseLen);
	}
}

package com.codingbat.string2.src;

public class ZipZap {

	/**
	 * Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. 
	 * Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
	 * zipZap("zipXzap") -> "zpXzp"
	 * zipZap("zopzop") -> "zpzp"
	 * zipZap("zzzopzop") -> "zzzpzp"
	 */
	public static String zipZap(String str) {
		  if(str==null || str.length()<3) return str;
		  String zipZap = "";
		  for(int i=0;i<str.length();i++) {
		    if(str.charAt(i)=='z' && str.charAt(i+2)=='p') {
		      zipZap+="zp";
		      i=i+2;
		    } else {
		      zipZap+=str.charAt(i);
		    }
		  }
		  return zipZap;
		}

	
}

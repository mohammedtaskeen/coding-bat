package com.codingbat.string2.src;

public class ZipZap {

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

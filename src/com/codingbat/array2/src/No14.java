package com.codingbat.array2.src;

public class No14 {

	public static boolean no14(int[] nums) {
		  boolean hasOne=false,hasFour=false;
		  for(int i=0;i<nums.length;i++) {
		    if(nums[i]==1) hasOne=true;
		    if(nums[i]==4) hasFour=true;
		  }
		  return !(hasOne&&hasFour);
		}

	
}

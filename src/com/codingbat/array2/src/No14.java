package com.codingbat.array2.src;

public class No14 {

	
	/**
	 * Given an array of ints, return true if it contains no 1's or it contains no 4's.
	 * no14([1, 2, 3]) -> true
	 * no14([1, 2, 3, 4]) -> false
	 * no14([2, 3, 4]) -> true
	 */
	public static boolean no14(int[] nums) {
		  boolean hasOne=false,hasFour=false;
		  for(int i=0;i<nums.length;i++) {
		    if(nums[i]==1) hasOne=true;
		    if(nums[i]==4) hasFour=true;
		  }
		  return !(hasOne&&hasFour);
		}

	
}

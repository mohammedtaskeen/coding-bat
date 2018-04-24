package com.codingbat.logic2.src;

public class MakeBricks {

	/**
	 * We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) 
	 * and big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks.
	 * makeBricks(3, 1, 8) -> true
	 * makeBricks(3, 1, 9) -> false
	 * makeBricks(3, 2, 10) -> true 
	 */
	public static boolean makeBricks(int small, int big, int goal) {
		if(goal> big*5+small) return false;
		if(goal%5> small) return false;
		return true;
	}
}

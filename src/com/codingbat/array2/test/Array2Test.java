package com.codingbat.array2.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.codingbat.array2.src.FizzArray2;
import com.codingbat.array2.src.No14;

class Array2Test {

	@Test
	void testFizzArray2() {
		assertArrayEquals(new String[] {"0", "1", "2", "3"}, FizzArray2.fizzArray2(4));
		assertArrayEquals(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}, FizzArray2.fizzArray2(10));
		assertArrayEquals(new String[] {"0", "1"}, FizzArray2.fizzArray2(2));
		assertArrayEquals(new String[] {"0"}, FizzArray2.fizzArray2(1));
		assertArrayEquals(new String[] {}, FizzArray2.fizzArray2(0));
		assertArrayEquals(new String[] {"0", "1", "2", "3", "4", "5", "6"}, FizzArray2.fizzArray2(7));
		assertArrayEquals(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8"}, FizzArray2.fizzArray2(9));
		assertArrayEquals(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}, FizzArray2.fizzArray2(11));
	}
	
	@Test
	void testNo14() {
		assertTrue(No14.no14(new int[] {1, 2, 3}));
		assertFalse(No14.no14(new int[] {1, 2, 3, 4}));
		assertTrue(No14.no14(new int[] {2, 3, 4}));
		assertFalse(No14.no14(new int[] {1, 1, 4, 4}));
		assertTrue(No14.no14(new int[] {2, 2, 4, 4}));
		assertFalse(No14.no14(new int[] {2, 3, 4, 1}));
		assertFalse(No14.no14(new int[] {1, 4}));
		assertTrue(No14.no14(new int[] {2}));
		assertTrue(No14.no14(new int[] {2, 1}));
		assertTrue(No14.no14(new int[] {1}));
		assertTrue(No14.no14(new int[] {4}));
		assertTrue(No14.no14(new int[] {}));
		assertTrue(No14.no14(new int[] {1, 1, 1, 1}));
		assertFalse(No14.no14(new int[] {9, 4, 4, 1}));
		assertFalse(No14.no14(new int[] {4, 2, 3, 1}));
		assertTrue(No14.no14(new int[] {4, 2, 3, 5}));
		assertTrue(No14.no14(new int[] {4, 4, 2}));
		assertFalse(No14.no14(new int[] {1, 4, 4}));
	}

}

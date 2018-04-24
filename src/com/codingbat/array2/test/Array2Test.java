package com.codingbat.array2.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.codingbat.array2.src.Either24;
import com.codingbat.array2.src.FizzArray2;
import com.codingbat.array2.src.Has77;
import com.codingbat.array2.src.IsEverywhere;
import com.codingbat.array2.src.MatchUp;
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

	@Test
	void testIsEverywhere() {
		assertTrue(IsEverywhere.isEverywhere(new int[] {1, 2, 1, 3} , 1));
		assertFalse(IsEverywhere.isEverywhere(new int[] {1, 2, 1, 3} , 2));
		assertFalse(IsEverywhere.isEverywhere(new int[] {1, 2, 1, 3, 4} , 1));
		assertTrue(IsEverywhere.isEverywhere(new int[] {2, 1, 2, 1} , 1));
		assertTrue(IsEverywhere.isEverywhere(new int[] {2, 1, 2, 1} , 2));
		assertFalse(IsEverywhere.isEverywhere(new int[] {2, 1, 2, 3, 1} , 2));
		assertTrue(IsEverywhere.isEverywhere(new int[] {3, 1} , 3));
		assertFalse(IsEverywhere.isEverywhere(new int[] {3, 1} , 2));
		assertTrue(IsEverywhere.isEverywhere(new int[] {3} , 1));
		assertTrue(IsEverywhere.isEverywhere(new int[] {} , 1));
		assertTrue(IsEverywhere.isEverywhere(new int[] {1, 2, 1, 2, 3, 2, 5} , 2));
		assertFalse(IsEverywhere.isEverywhere(new int[] {1, 2, 1, 1, 1, 2} , 2));
		assertFalse(IsEverywhere.isEverywhere(new int[] {2, 1, 2, 1, 1, 2} , 2));
		assertFalse(IsEverywhere.isEverywhere(new int[] {2, 1, 2, 2, 2, 1, 1, 2} , 2));
		assertTrue(IsEverywhere.isEverywhere(new int[] {2, 1, 2, 2, 2, 1, 2, 1} , 2));
		assertTrue(IsEverywhere.isEverywhere(new int[] {2, 1, 2, 1, 2} , 2));
	}
	
	@Test
	void testEither24() {
		assertTrue(Either24.either24(new int[] {1, 2, 2}));
		assertTrue(Either24.either24(new int[] {4, 4, 1}));
		assertFalse(Either24.either24(new int[] {4, 4, 1, 2, 2}));
		assertFalse(Either24.either24(new int[] {1, 2, 3, 4}));
		assertFalse(Either24.either24(new int[] {3, 5, 9}));
		assertTrue(Either24.either24(new int[] {1, 2, 3, 4, 4}));
		assertTrue(Either24.either24(new int[] {2, 2, 3, 4}));
		assertTrue(Either24.either24(new int[] {1, 2, 3, 2, 2, 4}));
		assertFalse(Either24.either24(new int[] {1, 2, 3, 2, 2, 4, 4}));
		assertFalse(Either24.either24(new int[] {1, 2}));
		assertTrue(Either24.either24(new int[] {2, 2}));
		assertTrue(Either24.either24(new int[] {4, 4}));
		assertFalse(Either24.either24(new int[] {2}));
		assertFalse(Either24.either24(new int[] {}));
	}
	
	@Test
	void testMatchUp() {
		assertEquals(2, MatchUp.matchUp(new int[] {1, 2, 3}, new int[] {2, 3, 10}));
		assertEquals(3, MatchUp.matchUp(new int[] {1, 2, 3}, new int[] {2, 3, 5}));
		assertEquals(2, MatchUp.matchUp(new int[] {1, 2, 3}, new int[] {2, 3, 3}));
		assertEquals(1, MatchUp.matchUp(new int[] {5, 3}, new int[] {5, 5}));
		assertEquals(2, MatchUp.matchUp(new int[] {5, 3}, new int[] {4, 4}));
		assertEquals(1, MatchUp.matchUp(new int[] {5, 3}, new int[] {3, 3}));
		assertEquals(1, MatchUp.matchUp(new int[] {5, 3}, new int[] {2, 2}));
		assertEquals(1, MatchUp.matchUp(new int[] {5, 3}, new int[] {1, 1}));
		assertEquals(0, MatchUp.matchUp(new int[] {5, 3}, new int[] {0, 0}));
		assertEquals(0, MatchUp.matchUp(new int[] {4}, new int[] {4}));
		assertEquals(1, MatchUp.matchUp(new int[] {4}, new int[] {5}));
	}
	
	@Test
	void testHas77() {
		assertTrue(Has77.has77(new int[] {1, 7, 7}));
		assertTrue(Has77.has77(new int[] {1, 7, 1, 7}));
		assertFalse(Has77.has77(new int[] {1, 7, 1, 1, 7}));
		assertTrue(Has77.has77(new int[] {7, 7, 1, 1, 7}));
		assertFalse(Has77.has77(new int[] {2, 7, 2, 2, 7, 2}));
		assertTrue(Has77.has77(new int[] {2, 7, 2, 2, 7, 7}));
		assertTrue(Has77.has77(new int[] {7, 2, 7, 2, 2, 7}));
		assertFalse(Has77.has77(new int[] {7, 2, 6, 2, 2, 7}));
		assertTrue(Has77.has77(new int[] {7, 7, 7}));
		assertTrue(Has77.has77(new int[] {7, 1, 7}));
		assertFalse(Has77.has77(new int[] {7, 1, 1}));
		assertFalse(Has77.has77(new int[] {1, 2}));
		assertFalse(Has77.has77(new int[] {1, 7}));
		assertFalse(Has77.has77(new int[] {7}));
	}
}

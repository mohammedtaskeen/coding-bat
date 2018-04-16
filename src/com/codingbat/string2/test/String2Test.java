package com.codingbat.string2.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

import com.codingbat.string2.src.DoubleChar;
import com.codingbat.string2.src.SameStarChar;

class String2Test {

	@Test
	void testDoubleChar() {
		assertEquals("TThhee", DoubleChar.doubleChar("The"));
		assertEquals("AAAAbbbb", DoubleChar.doubleChar("AAbb"));
		assertEquals("HHii--TThheerree", DoubleChar.doubleChar("Hi-There"));
		assertEquals("WWoorrdd!!", DoubleChar.doubleChar("Word!"));
		assertEquals("!!!!", DoubleChar.doubleChar("!!"));
		assertEquals("", DoubleChar.doubleChar(""));
		assertEquals("aa", DoubleChar.doubleChar("a"));
		assertEquals("..", DoubleChar.doubleChar("."));
		assertEquals("aaaa", DoubleChar.doubleChar("aa"));
	}

	@Test
	void testSameStarChar() {
		assertTrue(SameStarChar.sameStarChar("xy*yzz"));
		assertFalse(SameStarChar.sameStarChar("xy*zzz"));
		assertTrue(SameStarChar.sameStarChar("*xa*az"));
		assertFalse(SameStarChar.sameStarChar("*xa*bz"));
		assertTrue(SameStarChar.sameStarChar("*xa*a*"));
		assertTrue(SameStarChar.sameStarChar(""));
		assertTrue(SameStarChar.sameStarChar("*xa*a*a"));
		assertFalse(SameStarChar.sameStarChar("*xa*a*b"));
		assertTrue(SameStarChar.sameStarChar("*12*2*2"));
		assertFalse(SameStarChar.sameStarChar("12*2*3*"));
		assertTrue(SameStarChar.sameStarChar("abcDEF"));
		assertFalse(SameStarChar.sameStarChar("XY*YYYY*Z*"));
		assertTrue(SameStarChar.sameStarChar("XY*YYYY*Y*"));
		assertFalse(SameStarChar.sameStarChar("12*2*3*"));
		assertTrue(SameStarChar.sameStarChar("*"));
		assertTrue(SameStarChar.sameStarChar("**"));
	}
	
}

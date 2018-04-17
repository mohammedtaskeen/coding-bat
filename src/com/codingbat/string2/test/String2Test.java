package com.codingbat.string2.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

import com.codingbat.string2.src.DoubleChar;
import com.codingbat.string2.src.OneTwo;
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
	
	@Test
	void testOneTwo() {
		assertEquals("bca", OneTwo.oneTwo("abc"));
		assertEquals("cat", OneTwo.oneTwo("tca"));
		assertEquals("catdog", OneTwo.oneTwo("tcagdo"));
		assertEquals("hocolctea", OneTwo.oneTwo("chocolate"));
		assertEquals("231564897", OneTwo.oneTwo("1234567890"));
		assertEquals("abxabxabxabxabxabxabx", OneTwo.oneTwo("xabxabxabxabxabxabxab"));
		assertEquals("bcaefd", OneTwo.oneTwo("abcdefx"));
		assertEquals("bcaefd", OneTwo.oneTwo("abcdefxy"));
		assertEquals("bcaefdyzx", OneTwo.oneTwo("abcdefxyz"));
		assertEquals("", OneTwo.oneTwo(""));
		assertEquals("", OneTwo.oneTwo("x"));
		assertEquals("", OneTwo.oneTwo("xy"));
		assertEquals("yzx", OneTwo.oneTwo("xyz"));
		assertEquals("bcaefdhigkljmnkpqostrvwuyzx231564897", OneTwo.oneTwo("abcdefghijklkmnopqrstuvwxyz1234567890"));
		assertEquals("bcaefdhigkljmnkpqostrvwuyzx231564897", OneTwo.oneTwo("abcdefghijklkmnopqrstuvwxyz123456789"));
		assertEquals("bcaefdhigkljmnkpqostrvwuyzx231564", OneTwo.oneTwo("abcdefghijklkmnopqrstuvwxyz12345678"));
		
	}
	
}

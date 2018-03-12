package com.codingbat.string2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.codingbat.string2.DoubleChar;

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

}

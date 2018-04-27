package com.codingbat.recursion1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.codingbat.recursion1.src.CountHi2;
import com.codingbat.recursion1.src.StringClean;

public class Recursion1Test {

	@Test
	void testStringClean() {
		assertEquals("yza", StringClean.stringClean("yyzzza"));
		assertEquals("abcd", StringClean.stringClean("abbbcdd"));
		assertEquals("Helo", StringClean.stringClean("Hello"));
		assertEquals("XabcY", StringClean.stringClean("XXabcYY"));
		assertEquals("12ab45", StringClean.stringClean("112ab445"));
		assertEquals("Helo Bokeper", StringClean.stringClean("Hello Bookkeeper"));
	}


	@Test
	void testCountHi2() { 
		assertEquals(1, CountHi2.countHi2("ahixhi"));
		assertEquals(2, CountHi2.countHi2("ahibhi"));
		assertEquals(0, CountHi2.countHi2("xhixhi"));
		assertEquals(1, CountHi2.countHi2("hixhi"));
		assertEquals(2, CountHi2.countHi2("hixhhi"));
		assertEquals(3, CountHi2.countHi2("hihihi"));
		assertEquals(3, CountHi2.countHi2("hihihix"));
		assertEquals(2, CountHi2.countHi2("xhihihix"));
		assertEquals(0, CountHi2.countHi2("xxhi"));
		assertEquals(1, CountHi2.countHi2("hixxhi"));
		assertEquals(1, CountHi2.countHi2("hi"));
		assertEquals(0, CountHi2.countHi2("xxxx"));
		assertEquals(0, CountHi2.countHi2("h"));
		assertEquals(0, CountHi2.countHi2("x"));
		assertEquals(0, CountHi2.countHi2(""));
		assertEquals(1, CountHi2.countHi2("Hellohi"));
	}
}

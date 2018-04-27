package com.codingbat.recursion1.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

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

}

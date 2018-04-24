package com.codingbat.string3.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.codingbat.string3.src.CountYZ;
import com.codingbat.string3.src.WithoutString;

public class String3Test {

	@Test
	void testWithoutString() {
		assertEquals("He there", WithoutString.withoutString("Hello there", "llo"));
		assertEquals("Hllo thr", WithoutString.withoutString("Hello there", "e"));
		assertEquals("Hello there", WithoutString.withoutString("Hello there", "x"));
		assertEquals("Th  a FH", WithoutString.withoutString("This is a FISH", "IS"));
		assertEquals("TH  a FH", WithoutString.withoutString("THIS is a FISH", "is"));
		assertEquals("TH  a FH", WithoutString.withoutString("THIS is a FISH", "iS"));
		assertEquals("abab", WithoutString.withoutString("abxxxxab", "xx"));
		assertEquals("abxab", WithoutString.withoutString("abxxxab", "xx"));
		assertEquals("abab", WithoutString.withoutString("abxxxab", "x"));
		assertEquals("", WithoutString.withoutString("xxx", "x"));
		assertEquals("x", WithoutString.withoutString("xxx", "xx"));
		assertEquals("xzz", WithoutString.withoutString("xyzzy", "Y"));
		assertEquals("", WithoutString.withoutString("", "x"));
		assertEquals("acac", WithoutString.withoutString("abcabc", "b"));
		assertEquals("AAbb", WithoutString.withoutString("AA22bb", "2"));
		assertEquals("", WithoutString.withoutString("1111", "1"));
		assertEquals("", WithoutString.withoutString("1111", "11"));
		assertEquals("jtx", WithoutString.withoutString("MkjtMkx", "Mk"));
		assertEquals("Hi ", WithoutString.withoutString("Hi HoHo", "Ho"));
	}
	
	@Test
	void testCountYZ() {
		assertEquals(2, CountYZ.countYZ("fez day"));
		assertEquals(2, CountYZ.countYZ("day fez"));
		assertEquals(2, CountYZ.countYZ("day fyyyz"));
		assertEquals(1, CountYZ.countYZ("day yak"));
		assertEquals(1, CountYZ.countYZ("day:yak"));
		assertEquals(2, CountYZ.countYZ("!!day--yaz!!"));
		assertEquals(0, CountYZ.countYZ("yak zak"));
		assertEquals(2, CountYZ.countYZ("DAY abc XYZ"));
		assertEquals(3, CountYZ.countYZ("aaz yyz my"));
		assertEquals(2, CountYZ.countYZ("y2bz"));
		assertEquals(0, CountYZ.countYZ("zxyx"));
	}
	
}

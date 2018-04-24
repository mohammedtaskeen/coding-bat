package com.codingbat.string2.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

import com.codingbat.string2.src.DoubleChar;
import com.codingbat.string2.src.OneTwo;
import com.codingbat.string2.src.PlusOut;
import com.codingbat.string2.src.SameStarChar;
import com.codingbat.string2.src.StarOut;
import com.codingbat.string2.src.WordEnds;
import com.codingbat.string2.src.ZipZap;

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
	
	@Test
	void testZipZap() {
		assertEquals("zpXzp", ZipZap.zipZap("zipXzap"));
		assertEquals("zpzp", ZipZap.zipZap("zopzop"));
		assertEquals("zzzpzp", ZipZap.zipZap("zzzopzop"));
		assertEquals("zibzp", ZipZap.zipZap("zibzap"));
		assertEquals("zp", ZipZap.zipZap("zip"));
		assertEquals("zi", ZipZap.zipZap("zi"));
		assertEquals("z", ZipZap.zipZap("z"));
		assertEquals("", ZipZap.zipZap(""));
		assertEquals("zp", ZipZap.zipZap("zzp"));
		assertEquals("abcppp", ZipZap.zipZap("abcppp"));
		assertEquals("azbcppp", ZipZap.zipZap("azbcppp"));
		assertEquals("azbcpzp", ZipZap.zipZap("azbcpzpp"));
	}
	
	@Test
	void testStarOut() {
		assertEquals("ad", StarOut.starOut("ab*cd"));
		assertEquals("ad", StarOut.starOut("ab**cd"));
		assertEquals("silly", StarOut.starOut("sm*eilly"));
		assertEquals("siy", StarOut.starOut("sm*eil*ly"));
		assertEquals("siy", StarOut.starOut("sm**eil*ly"));
		assertEquals("siy", StarOut.starOut("sm***eil*ly"));
		assertEquals("string", StarOut.starOut("stringy*"));
		assertEquals("tringy", StarOut.starOut("*stringy"));
		assertEquals("ty", StarOut.starOut("*str*in*gy"));
		assertEquals("abc", StarOut.starOut("abc"));
		assertEquals("c", StarOut.starOut("a*bc"));
		assertEquals("ab", StarOut.starOut("ab"));
		assertEquals("", StarOut.starOut("a*b"));
		assertEquals("a", StarOut.starOut("a"));
		assertEquals("", StarOut.starOut("a*"));
		assertEquals("", StarOut.starOut("*a"));
		assertEquals("", StarOut.starOut("*"));
		assertEquals("", StarOut.starOut(""));
	}
	
	@Test
	void testPlusOut() {
		assertEquals("++XY+++XY+", PlusOut.plusOut("abXYabcXYZ", "XY"));
	}
	
	
	@Test
	void testWordEnds()	{
		assertEquals("c13i",WordEnds.wordEnds("abcXY123XYijk", "XY"));
		assertEquals("13",WordEnds.wordEnds("XY123XY", "XY"));
		assertEquals("11",WordEnds.wordEnds("XY1XY", "XY"));
		assertEquals("XY",WordEnds.wordEnds("XYXY", "XY") );
		assertEquals("",WordEnds.wordEnds("XY", "XY"));
		assertEquals("",WordEnds.wordEnds("Hi", "XY"));
		assertEquals("",WordEnds.wordEnds("", "XY"));
		assertEquals("cxziij",WordEnds.wordEnds("abc1xyz1i1j", "1"));
		assertEquals("cxz",WordEnds.wordEnds("abc1xyz1", "1"));
		assertEquals("cxz11",WordEnds.wordEnds("abc1xyz11", "1"));
		assertEquals("11",WordEnds.wordEnds("abc1xyz1abc", "abc"));
		assertEquals("acac",WordEnds.wordEnds("abc1xyz1abc", "b"));
		assertEquals("1111",WordEnds.wordEnds("abc1abc1abc", "abc"));
	}
}

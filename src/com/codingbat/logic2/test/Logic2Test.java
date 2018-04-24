package com.codingbat.logic2.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.codingbat.logic2.src.MakeBricks;

public class Logic2Test {
	
	@Test
	void testMakeBricks() {
		assertTrue(MakeBricks.makeBricks(3, 1, 8));
		assertFalse(MakeBricks.makeBricks(3, 1, 9));
		assertTrue(MakeBricks.makeBricks(3, 2, 10));
		assertTrue(MakeBricks.makeBricks(3, 2, 8));
		assertFalse(MakeBricks.makeBricks(3, 2, 9));
		assertTrue(MakeBricks.makeBricks(6, 1, 11));
		assertFalse(MakeBricks.makeBricks(6, 0, 11));
		assertTrue(MakeBricks.makeBricks(1, 4, 11));
		assertTrue(MakeBricks.makeBricks(0, 3, 10));
		assertFalse(MakeBricks.makeBricks(1, 4, 12));
		assertTrue(MakeBricks.makeBricks(3, 1, 7));
		assertFalse(MakeBricks.makeBricks(1, 1, 7));
		assertTrue(MakeBricks.makeBricks(2, 1, 7));
		assertTrue(MakeBricks.makeBricks(7, 1, 11));
		assertTrue(MakeBricks.makeBricks(7, 1, 8));
		assertFalse(MakeBricks.makeBricks(7, 1, 13));
		assertTrue(MakeBricks.makeBricks(43, 1, 46));
		assertFalse(MakeBricks.makeBricks(40, 1, 46));
		assertTrue(MakeBricks.makeBricks(40, 2, 47));
		assertTrue(MakeBricks.makeBricks(40, 2, 50));
		assertFalse(MakeBricks.makeBricks(40, 2, 52));
		assertFalse(MakeBricks.makeBricks(22, 2, 33));
		assertTrue(MakeBricks.makeBricks(0, 2, 10));
		assertTrue(MakeBricks.makeBricks(1000000, 1000, 1000100));
		assertFalse(MakeBricks.makeBricks(2, 1000000, 100003));
		assertTrue(MakeBricks.makeBricks(20, 0, 19));
		assertFalse(MakeBricks.makeBricks(20, 0, 21));
		assertFalse(MakeBricks.makeBricks(20, 4, 51));
		assertTrue(MakeBricks.makeBricks(20, 4, 39));
		
	}

}

package com.visa.prj.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayUtilTest {

	@Test
	public void testGetSum() {
		int[] data = {5,4,3,2,1};
		int expected = 15;
		assertEquals(expected, ArrayUtil.getSum(data));
	}

	@Test
	public void testSort() {
		int[] data = {5,4,3,2,1};
		int[] expected = {1,2,3,4,5};
		ArrayUtil.sort(data);
		assertArrayEquals(expected, data);
	}

	@Test
	public void testGetCount() {
		int[] data = {5,4,3,2,1};
		int expected = 1;
		assertEquals(expected, ArrayUtil.getCount(data,4));
	}

}

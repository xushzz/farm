package com.farm.jady;

import junit.framework.TestCase;
import com.sirap.basic.util.StrUtil;

public class TestStrUtil extends TestCase {

	public void testIsDigitsOnly() {
		assertTrue(StrUtil.isDigitsOnly("0123456789"));
		assertFalse(StrUtil.isDigitsOnly("0123456789d"));
	}

	public void testIsDigit() {
		assertTrue(StrUtil.isDigit('0'));
		assertFalse(StrUtil.isDigit('d'));
	}

	public void testContainsDigit() {
		assertTrue(StrUtil.containsDigit("abcd0"));
		assertFalse(StrUtil.containsDigit("abcd"));
	}

	public void testContainsNoneOfDigit() {
		assertTrue(StrUtil.containsNoneOfDigit("abcd"));
		assertFalse(StrUtil.containsNoneOfDigit("abcd0"));
	}

}

package com.farm.xush;

import org.junit.Test;

import com.sirap.basic.util.StrUtil;

/**
 * @author xush StrUtil测试
 */
public class TestStrUtil {
	@Test
	public void takeDigitsOnlyTest() {
		System.out.println(StrUtil.takeDigitsOnly("xus h"));
	}

	@Test
	public void extractFirstIntegerTest() {
		System.out.println(StrUtil.extractFirstInteger("xush"));
	}

	@Test
	public void containsNoneOfDigitTest() {
		if (StrUtil.containsNoneOfDigit("xush")) {
			System.out.println("true");
		} else {
			System.out.println("false");			
		}
	}

	@Test
	public void containsDigitTest() {
		if (StrUtil.containsDigit("xusonghe")) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}

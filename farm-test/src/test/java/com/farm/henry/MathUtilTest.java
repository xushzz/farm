package com.farm.henry;

import org.junit.Test;

import com.sirap.basic.util.MathUtil;

/**
 * @author henry
 * 测试Math工具
 */
public class MathUtilTest {
	/**
	 * 两个数字相加
	 */
	@Test
	public void test_add(){
		System.out.println(MathUtil.add(8L, 2L));
	}
	
	/**
	 * 两个数字相乘
	 */
	@Test
	public void test_multiply(){
		System.out.println(MathUtil.multiply(8L, 2L));
	}
	
	/**
	 * 两个数字相除
	 */
	@Test
	public void test_divide(){
		System.out.println(MathUtil.divide(8L, 2L,2));
	}
	
	/**
	 * 两个数字相减
	 */
	@Test
	public void test_subtract(){
		System.out.println(MathUtil.subtract(8L, 2L));
	}
	
}

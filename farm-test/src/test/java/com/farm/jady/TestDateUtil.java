package com.farm.jady;

import junit.framework.TestCase;

import java.util.Calendar;

import com.sirap.basic.util.DateUtil;

public class TestDateUtil extends TestCase {
	private Calendar cal = null;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();

		cal = Calendar.getInstance();
		cal.set(2019, 3, 25);
	}

	public void testDayOfWeek() {
		int week = DateUtil.getDayOfWeek(cal.getTime());
		assertEquals(week, cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
	}

	public void testGetYear() {
		int year = DateUtil.getYear(cal.getTime());
		assertEquals(year, 2019);
	}

	public void testGetMonth() {
		int month = DateUtil.getMonth(cal.getTime());
		assertEquals(month, 3);
	}

	public void testGetDay() {
		int day = DateUtil.getDay(cal.getTime());
		assertEquals(day, cal.get(Calendar.DAY_OF_YEAR));
	}

}

package com.farm.xush;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.sirap.basic.util.DateUtil;

/**
 * @author xush 
 * DateUtil测试
 */
public class TestDateUtil {
	@Test
	public void timestampTest() {
		System.out.println(DateUtil.timestamp());
	}

	@Test
	public void displayNowTest() {
		System.out.println(DateUtil.displayNow());
	}
	@Test
	public void displayNowTest2() {
		System.out.println(DateUtil.displayNow("yyyy-mm-dd"));
	}
	@Test
	public void displayDateTest() throws ParseException {
		SimpleDateFormat simFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss"); 
		Date dtBeg = simFormat.parse("2019.03.28 19:35:00");
		System.out.println(DateUtil.displayDate(dtBeg));
	}
	
	
	
}

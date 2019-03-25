package com.farm.henry;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

/**
 * @author henry
 * JAVA正则表达式：Pattern类与Matcher类测试
 */
public class RegexTest {
	
	/**
	 * pattern() 返回正则表达式的字符串形式
	 */
	@Test
	public void testPattern(){
		Pattern p=Pattern.compile("\\w+"); 
		String str=p.pattern();
		System.out.println(str);
	}
	
	/**
	 * split方法,用于分隔字符串
	 */
	@Test
	public void testSplit(){
		Pattern p=Pattern.compile("\\d+"); 
		String[] str=p.split("我的QQ是:456456我的电话是:0532214我的邮箱是:aaa@aaa.com"); 
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
	
	/**
	 * Pattern.matches(String regex,CharSequence input)是一个静态方法,
	 * 用于快速匹配字符串,该方法适合用于只匹配一次,且匹配全部字符串.
	 */
	@Test
	public void testMatches(){
		System.out.println(Pattern.matches("\\d+","2223"));//返回true 
		System.out.println(Pattern.matches("\\d+","2223aa"));//返回false,需要匹配到所有字符串才能返回true,这里aa不能匹配到 
		System.out.println(Pattern.matches("\\d+","22bb23"));//返回false,需要匹配到所有字符串才能返回true,这里bb不能匹配到 
	}
	
	/**
	 * Pattern.matcher(CharSequence input)返回一个Matcher对象
	 */
	@Test
	public void testMatcher(){
		Pattern p=Pattern.compile("\\d+"); 
		Matcher m=p.matcher("22bb23"); 
		System.out.println(m.pattern());//返回p 也就是返回该Matcher对象是由哪个Pattern对象的创建的 
	}
	
	/**
	 * matches()对整个字符串进行匹配,只有整个字符串都匹配了才返回true 
	 */
	@Test
	public void testMatches1(){
		Pattern p=Pattern.compile("\\d+"); 
		Matcher m=p.matcher("22bb23"); 
		System.out.println(m.matches());//返回false,因为bb不能被\d+匹配,导致整个字符串匹配未成功. 
		Matcher m2=p.matcher("2223"); 
		System.out.println(m2.matches());//返回true,因为\d+匹配到了整个字符串
	}
	
	/**
	 * lookingAt()对前面的字符串进行匹配,只有匹配到的字符串在最前面才返回true
	 */
	@Test
	public void testLookingAt(){
		Pattern p=Pattern.compile("\\d+"); 
		Matcher m=p.matcher("22bb23"); 
		System.out.println(m.lookingAt());//返回true,因为\d+匹配到了前面的22 
		Matcher m2=p.matcher("aa2223"); 
		System.out.println(m2.lookingAt());//返回false,因为\d+不能匹配前面的aa 
	}
	
	/**
	 * find()对字符串进行匹配,匹配到的字符串可以在任何位置.
	 */
	@Test
	public void testFind(){
		Pattern p=Pattern.compile("\\d+"); 
		Matcher m=p.matcher("22bb23"); 
		System.out.println(m.find());//返回true 
		Matcher m2=p.matcher("aa2223"); 
		System.out.println(m2.find());//返回true 
		Matcher m3=p.matcher("aa2223bb"); 
		System.out.println(m3.find());//返回true 
		Matcher m4=p.matcher("aabb"); 
		System.out.println(m4.find());//返回false 
	}
	
	/**
	 * start()返回匹配到的子字符串在字符串中的索引位置. 
	 * end()返回匹配到的子字符串的最后一个字符在字符串中的索引位置. 
	 * group()返回匹配到的子字符串 
	 */
	@Test
	public void testStart_end_group(){
		Pattern p=Pattern.compile("\\d+"); 
		Matcher m=p.matcher("aaa2223bb"); 
		System.out.println(m.find());//匹配2223 
		System.out.println(m.start());//返回3 
		System.out.println(m.end());//返回7,返回的是2223后的索引号 
		System.out.println(m.group());//返回2223 

		Matcher m2=p.matcher("2223bb"); 
		System.out.println(m2.lookingAt());   //匹配2223 
		System.out.println(m2.start());   //返回0,由于lookingAt()只能匹配前面的字符串,所以当使用lookingAt()匹配时,start()方法总是返回0 
		System.out.println(m2.end());   //返回4 
		System.out.println(m2.group());   //返回2223 

		Matcher m3=p.matcher("2223bb"); 
		System.out.println(m3.matches());   //匹配整个字符串 
		System.out.println(m3.start());   //返回0,原因相信大家也清楚了 
		System.out.println(m3.end());   //返回6,原因相信大家也清楚了,因为matches()需要匹配所有字符串 
		System.out.println(m3.group());   //返回2223bb 
	}
	
	/**
	 * 遍历
	 */
	@Test
	public void testEntry(){
		Pattern p=Pattern.compile("\\d+"); 
		Matcher m=p.matcher("我的QQ是:456456 我的电话是:0532214 我的邮箱是:aaa123@aaa.com"); 
		while(m.find()) { 
		     System.out.println(m.group()); 
		     System.out.print("start:"+m.start()); 
		     System.out.println(" end:"+m.end()); 
		} 
	}
}

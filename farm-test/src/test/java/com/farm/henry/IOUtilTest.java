package com.farm.henry;

import java.io.File;
import java.util.List;

import org.junit.Test;

import com.sirap.basic.util.IOUtil;

/**
 * @author henry
 *	测试IO工具
 */
public class IOUtilTest {
	/**
	 * 复制文件
	 */
	@Test
	public void test_copyFile(){
		IOUtil.copyFile(new File("e:\\sirap-basic-3.5-SNAPSHOT.jar"), new File("e:\\sirap-basic-copy.jar"));
	}
	
	/**
	 * 读取文本行装载到list集合中
	 */
	@Test
	public void test_readLines(){
		List<String> lists=IOUtil.readLines("e:\\word.txt");
		for (String string : lists) {
			System.out.println(string);
		}
	}
	
	/**
	 * 读取文本装载到一个字符串中
	 */
	@Test
	public void test_readLine(){
		String str=IOUtil.readString("e:\\word.txt");
		System.out.println(str);
	}
	
	/**
	 * 保存字节数组到文件中
	 */
	@Test
	public void test_save(){
		byte[] file="012345678".getBytes();
		IOUtil.save(file,"e:\\word.txt");
	}
}

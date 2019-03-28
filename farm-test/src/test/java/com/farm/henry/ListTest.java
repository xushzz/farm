package com.farm.henry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

import com.farm.henry.pojo.Student;
import com.farm.henry.pojo.Teacher;
import com.farm.henry.util.ScpComparableUtil;
import com.farm.henry.util.ScpReflectUtils;
import com.farm.henry.util.SortList;

/**
 * @author henry
 * 集合排序测试
 */
public class ListTest {
	
	/**
	 * 测试字段反射获取对象
	 */
	@Test
	public void testFiedReflect(){
		Student stu=null;
        stu=new Student();
        stu.setName("whuang");
        stu.setAge(12);
        stu.setScore(80);
        
        Integer age=(Integer) ScpReflectUtils.getObjectValue(stu, "age");
        System.out.println(age);
	}
	
	/**
	 * 测试Comparator接口的排序
	 */
	@Test
	public void test_ListComparator(){
		List<Student>students=new ArrayList<Student>();
        Student stu=null;
        stu=new Student();
        stu.setName("whuang");
        stu.setAge(12);
        stu.setScore(80);
        students.add(stu);
        
        stu=new Student();
        stu.setName("rong");
        stu.setAge(11);
        stu.setScore(90);
        students.add(stu);
        
        stu=new Student();
        stu.setName("zhu");
        stu.setAge(15);
        stu.setScore(100);
        students.add(stu);
        
        Collections.sort(students,new ScpComparableUtil.ListComparator(true,"age"));
        System.out.println(students);
	}
	
	/**
	 * 测试Comparator接口的排序,指定升序和降序
	 */
	@Test
    public void test_ListComparator_sort(){
        List<Student>students=new ArrayList<Student>();
        Student stu=null;
        stu=new Student();
        stu.setName("whuang");
        stu.setAge(12);
        stu.setScore(80);
        students.add(stu);
        
        stu=new Student();
        stu.setName("zhu");
        stu.setAge(11);
        stu.setScore(90);
        students.add(stu);
        
        stu=new Student();
        stu.setName("rong");
        stu.setAge(15);
        stu.setScore(100);
        students.add(stu);
        SortList<Student> sortList = new SortList<Student>();  
        sortList.sort(students, "getAge", "desc");  
        System.out.println(students);
        
    }
	
	/**
	 * 测试Comparable接口的排序
	 */
	@Test
    public void test_ListComparable(){
        List<Teacher> teachers=new ArrayList<Teacher>();
        Teacher tea=null;
        tea=new Teacher();
        tea.setName("whuang");
        tea.setAge(12);
        teachers.add(tea);
        
        tea=new Teacher();
        tea.setName("zhu");
        tea.setAge(11);
        teachers.add(tea);
        
        tea=new Teacher();
        tea.setName("rong");
        tea.setAge(15);
        teachers.add(tea);
        
        Collections.sort(teachers);
        System.out.println(teachers);
        
    }

}

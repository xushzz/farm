package com.farm.henry.pojo;

public class Teacher implements Comparable{
	
	/***
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private int age;
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return this.age-((Teacher)o).age;
	}
	
	@Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

}

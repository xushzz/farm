package com.farm.henry.pojo;

public class Student{
    /***
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private int age;
    /**
     * 地址
     */
    private String address;
    /***
     * 考试得分
     */
    private int score;
    
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", score=" + score+ ", address=" + address+ "]";
    }
    
}
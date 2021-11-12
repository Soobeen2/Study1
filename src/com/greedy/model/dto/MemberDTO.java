package com.greedy.model.dto;
// Data 전달할 용도 
public class MemberDTO {

	// 변수  : 속성 
	private String name;
	private int age;
	private char gender;
	
	public MemberDTO() {
		
	}
	public MemberDTO(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "MemberDTO [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
}

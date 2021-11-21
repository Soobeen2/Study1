package com.subin.yeramProject.dto;

public class YeramDTO {

	private int stuNo;
	private String name;
	
	public YeramDTO() {}

	public YeramDTO(int stuNo, String name) {
		super();
		this.stuNo = stuNo;
		this.name = name;
	}

	public int getStuNo() {
		return stuNo;
	}

	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "YeramDTO [stuNo=" + stuNo + ", name=" + name + "]";
	}
}

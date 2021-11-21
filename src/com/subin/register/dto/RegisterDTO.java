package com.subin.register.dto;

public class RegisterDTO {

	private String name;
	private String major;
	private String number;
	private String tutor;
	private String adress;
	
	public RegisterDTO() {}

	public RegisterDTO(String name, String major, String number, String tutor, String adress) {
		super();
		this.name = name;
		this.major = major;
		this.number = number;
		this.tutor = tutor;
		this.adress = adress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getTutor() {
		return tutor;
	}

	public void setTutor(String tutor) {
		this.tutor = tutor;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "RegisterDTO [name=" + name + ", major=" + major + ", number=" + number + ", tutor=" + tutor
				+ ", adress=" + adress + "]";
	}
}

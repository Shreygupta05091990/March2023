package com.basic.java8;

import java.util.List;

public class CusotmerPojo {
	
	
	private String name;
	private int  age;
	private  String eMail;
	private List<String> phoneNumbers;
	public CusotmerPojo() {
		
	}
	public CusotmerPojo(String name, int age, String eMail, List<String> phoneNumbers) {
		super();
		this.name = name;
		this.age = age;
		this.eMail = eMail;
		this.phoneNumbers = phoneNumbers;
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
	@Override
	public String toString() {
		return "CusotmerPojo [name=" + name + ", age=" + age + ", eMail=" + eMail + ", phoneNumbers=" + phoneNumbers
				+ "]";
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	
	

}

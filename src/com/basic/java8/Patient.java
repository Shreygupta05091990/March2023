package com.basic.java8;

public class Patient {

	String id;
	int age;
	String disease;
	int amount;
	public Patient(String id, int age, String disease, int amount) {
		super();
		this.id = id;
		this.age = age;
		this.disease = disease;
		this.amount = amount;
	}
	public Patient() {
		
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + ", age=" + age + ", disease=" + disease + ", amount=" + amount + "]";
	}
	
	
	
	
}

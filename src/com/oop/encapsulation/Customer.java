package com.oop.encapsulation;

public class Customer {

//	variables	
	private String name;
	private String address;
	private boolean attitude;
	private int cvc;
	private int age;
	private int riskBandLevel;
	
//	getters and setter - right-click, source, Generate getters and setters
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isAttitude() {
		return attitude;
	}
	public void setAttitude(boolean attitude) {
		this.attitude = attitude;
	}
	public int getCvc() {
		return cvc;
	}
	public void setCvc(int cvc) {
		this.cvc = cvc;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRiskBandLevel() {
		return riskBandLevel;
	}
	public void setRiskBandLevel(int riskBandLevel) {
		this.riskBandLevel = riskBandLevel;
	}
	
	
	
	
}

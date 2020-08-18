package com.tyss.webservices.dto;

public class Data {
	private int a;
	private int b;
	private String type;
	private int value;
	
	public Data() {
	}
	
	public Data(int a, int b, String type, int value) {
		this.a = a;
		this.b = b;
		this.type = type;
		this.value = value;
	}

	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}

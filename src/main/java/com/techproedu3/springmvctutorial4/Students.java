package com.techproedu3.springmvctutorial4;

public class Students {

	
	private int id;
	private String name;
	private int grade;
	private String address;
	private int phone;
	public Students() {
	
		
	}
	
	public Students(int id, String name, int grade, String address, int phone) {
	
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.address = address;
		this.phone = phone;
	}

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getGrade() {
		return grade;
	}

	void setGrade(int grade) {
		this.grade = grade;
	}

	String getAddress() {
		return address;
	}

	void setAddress(String address) {
		this.address = address;
	}

	int getPhone() {
		return phone;
	}

	void setPhone(int phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", grade=" + grade + ", address=" + address + ", phone="
				+ phone + "]";
	}
	
	
	
}

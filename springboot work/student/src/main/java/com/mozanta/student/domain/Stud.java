package com.mozanta.student.domain;



public class Stud {

	private Long id;
	
	private String name;
	
	private int dob;
	
	private String classs;
	
	private String division;
	
	private String gender;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDob() {
		return dob;
	}

	public void setDob(int dob) {
		this.dob = dob;
	}

	public String getClasss() {
		return classs;
	}

	public void setClasss(String classs) {
		this.classs = classs;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division ) {
		this.division = division;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}


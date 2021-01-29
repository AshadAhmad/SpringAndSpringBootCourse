package com.ashadahmad.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private String codingLanguage;
	private LinkedHashMap<String, String> countries;
	private String[] operatingSystems;
	

	
	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	public String getCodingLanguage() {
		return codingLanguage;
	}

	public void setCodingLanguage(String codingLanguage) {
		this.codingLanguage = codingLanguage;
	}

	public Student() {
		countries = new LinkedHashMap();
		countries.put("IN", "India");
		countries.put("BR", "Brazil");
		countries.put("JP", "Japan");
		countries.put("US", "America");
		countries.put("DE", "Germany");
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LinkedHashMap<String, String> getCountries() {
		return countries;
	}
	
	
}

package com.ashadahmad.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.ashadahmad.springdemo.mvc.validation.CourseCode;

public class Customer {

	private String firstName;
	
	@NotNull(message="Lastname is required!") //These are validation rules
	@Size(min=1, message="Lastname must be greater than 1 letter!")
	private String lastName;
	
	@NotNull(message="Number of passes is required!")
	@Min(value=0, message="Minimum 0 passes is allowed, don't put negative numbers")
	@Max(value=10, message="Maximum 10 passes are allowed")
	private Integer passes; //Using primitive type and @NotNull will give us errors of type conversion, instead we can use the Integer(Wrapper classes) and can avoid any such error
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="Must have 5 digits/chars")
	private String postalCode;
	
	@CourseCode
	private String courseCode;
	
	
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public Integer getPasses() {
		return passes;
	}
	public void setPasses(Integer passes) {
		this.passes = passes;
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
}

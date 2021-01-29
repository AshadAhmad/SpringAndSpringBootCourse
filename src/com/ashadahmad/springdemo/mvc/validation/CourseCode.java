package com.ashadahmad.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

	//Define attributes for the annotation
	
	//define default course code
	public String value() default "ASH";
	
	//define default error message
	public String message() default "Must start with ASH";
	
	
	
	//A group is used to group together related constraints.
	//define default groups
	public Class<?>[] groups() default {};
	
	//A payload provide custom details about validation failure (severity level, error code etc)
	//define default payloads
	public Class<? extends Payload>[] payload() default {};
}

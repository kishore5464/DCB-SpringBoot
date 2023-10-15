package com.kishore.entity;

import org.springframework.stereotype.Component;

@Component
public class Teacher implements School {

//	private String name;
//	private Student student;
//
//	public Teacher(String name) {
//		super();
//		this.name = name;
//	}

	public void learn() {
		System.out.println("Teacher is teaching...");
	}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public Student getStudent() {
//		return student;
//	}
//
//	public void setStudent(Student student) {
//		this.student = student;
//	}
}

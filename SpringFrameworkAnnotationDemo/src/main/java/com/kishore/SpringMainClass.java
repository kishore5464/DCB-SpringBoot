package com.kishore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kishore.entity.Teacher;

public class SpringMainClass {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Teacher sch = (Teacher) context.getBean(Teacher.class);
		sch.learn();
	}
}

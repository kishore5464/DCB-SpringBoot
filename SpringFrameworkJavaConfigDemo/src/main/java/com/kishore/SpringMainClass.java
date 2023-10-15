package com.kishore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kishore.entity.Teacher;

public class SpringMainClass {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

		Teacher sch = (Teacher) context.getBean(Teacher.class);
		sch.learn();
	}
}

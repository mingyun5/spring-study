package org.study.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.study.spring.Student;

public class AppTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml"); 
		Student student = (Student)context.getBean("student");
		
		System.out.println(student);
		student.setName("문재인");
		
		Student student2 = (Student)context.getBean("student");
		System.out.println(student2);
		System.out.println(student);
	}

}

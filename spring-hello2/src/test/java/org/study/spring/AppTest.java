package org.study.spring;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

	@Test
	public void testGetBeans() {
		ApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml"); 
		Student student = (Student)context.getBean("student");
		
		System.out.println(student);
		student.setName("문재인");
		
		Student student2 = (Student)context.getBean("student");
		System.out.println(student2);
		System.out.println(student);
	}
	
}

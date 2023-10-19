package com.sammy;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sammy.dao.StudentDao;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/sammy/config.xml");
		/*
		 * HibernateTemplate tem = context.getBean("template",HibernateTemplate.class);
		 * System.out.println(tem);
		 */

		StudentDao dao = context.getBean("stDao", StudentDao.class);

		// INSERT

		Student st = new Student();
		st.setId(2);
		st.setName("Prashant up");
		st.setAddress("USA up");

		/*
		 * int i = dao.saveStudent(st);
		 * 
		 * System.out.println("Insert Successfully" +i);
		 */

		// Get data by id
		/*
		 * Student st = dao.getStudent(2); System.out.println(st);
		 */

		/*
		 * dao.updateStudent(st); System.out.println("update successfully");
		 */

		//delete data
		dao.deleteStudent(2);
		
		
		//get all data
		List<Student> list = dao.getAllStudent();
		for (Student sts : list) {
			System.out.println(sts);
		}
		
		
		

	}
}

package com.sammy.javaconfig;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.sammy.dao.StudentDao;
import com.sammy.model.Student;

public class App {

	public static void main(String[] args) throws SQLException {

		ApplicationContext context = new AnnotationConfigApplicationContext(config.class);

		JdbcTemplate jd = context.getBean("jdbc", JdbcTemplate.class);
		System.out.println(jd.getDataSource().getConnection());

		/*
		 * String sql = "insert into student(id,name,address) values(?,?,?)"; int i =
		 * jd.update(sql, 2, "Prashant", "USA");
		 * System.out.println("successfully inserted" +i);
		 */

		// Perform DAO STANDARD

		StudentDao dao = context.getBean("stDao", StudentDao.class);

		// INSERT

		/*
		 * Student st = new Student(); st.setId(4); st.setName("Jatin");
		 * st.setAddress("London");
		 * 
		 * int i = dao.insert(st); System.out.println("Insert Successfully" + i);
		 */
		// UPDATE data
		/*
		 * Student st = new Student(); st.setId(4); st.setName("Jatin up");
		 * st.setAddress("London up");
		 * 
		 * int i = dao.updateDetails(st); System.out.println("Update Successfully" + i);
		 */
		// Delete data

		/*
		 * int i = dao.delete(4); System.out.println("Delete Successfully" + i);
		 */
		// Get data by id

		
		/*
		 * Student st = dao.getStudentById(2); System.out.println(st);
		 */

		List<Student> list = dao.getAllStudent();

		for (Student sts : list) {
			System.out.println(sts);
		}

	}
}

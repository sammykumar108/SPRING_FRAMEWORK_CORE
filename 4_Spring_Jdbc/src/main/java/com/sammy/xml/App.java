package com.sammy.xml;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.sammy.dao.StudentDao;
import com.sammy.model.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws SQLException {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/sammy/xml/config.xml");
		
		  JdbcTemplate jd = context.getBean("jdbcTemplate", JdbcTemplate.class);
		  System.out.println(jd.getDataSource().getConnection());
		 
			/*
			 * String sql = "insert into student(id,name,address) values(?,?,?)";
			 * 
			 * int i = jd.update(sql, 2, "Prashant", "USA");
			 * 
			 * System.out.println("Successfully inserted" + i);
			 */

		// INSERT
		
		/*
		 * String sql="insert into student(id,name,address) values(?,?,?)";
		 * 
		 * int i=jd.update(sql,3,"Rahul","UK");
		 * 
		 * System.out.println("successfully inserted" +i);
		 */

		// UPDATE DATA
		
		/*
		 * String sql="update student set name=?,address=? where id=?"; int
		 * i=jd.update(sql,"Rahul up","UK up",3);
		 * System.out.println("Updated successfully" +i);
		 */

		// DELETE DATA
		
		/*
		 * String sql="delete from student where id=?"; int i = jd.update(sql,3);
		 * System.out.println("Delete successfully" +i);
		 */

		// fetch data by id

		
		/*
		 * String sql = "select * from student where id=?";
		 * 
		 * RowMapper rowMapper = new RowMapper() {
		 * 
		 * public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		 * 
		 * String name = rs.getString(2);
		 * 
		 * return name; }
		 * 
		 * };
		 * 
		 * String name = jd.queryForObject(sql, rowMapper, 2); System.out.println(name);
		 */

		/*
		 * String sql = "select * from student";
		 * 
		 * RowMapper rowMapper = new RowMapper() {
		 * 
		 * public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		 * 
		 * String name = rs.getString(2);
		 * 
		 * return name; } };
		 * 
		 * List<String> list = jd.query(sql, rowMapper);
		 * 
		 * for (String name : list) { System.out.println(name); }
		 */

		// Perform Dao Standard

		StudentDao dao = context.getBean("stDao", StudentDao.class);

		// INSERT
		
		
		/*
		 * Student st=new Student(); st.setId(3); st.setName("Rahul");
		 * st.setAddress("UK");
		 * 
		 * int i=dao.insert(st); System.out.println("Insert Successfully" +i);
		 */

		// UPDATE data
		
		/*
		 * Student st=new Student(); st.setId(3); st.setName("Rahul up");
		 * st.setAddress("UK up");
		 * 
		 * int i=dao.updateDetails(st); System.out.println("Update Successfully" +i);
		 */

		// Delete data
		
		/*
		 * int i=dao.delete(3); System.out.println("Delete Successfully" +i);
		 */

		// Get data by id
		
		/*
		 * Student st = dao.getStudentById(2); System.out.println(st);
		 */
		
		
		
		  List<Student> list = dao.getAllStudent();
		  
		  for (Student sts : list) { System.out.println(sts); }
		 
		
	}
}

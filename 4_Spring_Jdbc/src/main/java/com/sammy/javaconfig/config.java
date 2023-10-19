package com.sammy.javaconfig;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import com.sammy.dao.StudentDao;
import com.sammy.dao.StudentDaoImpl;

@ComponentScan(basePackages = "com.sammy.dao")
@Configuration
public class config {

	@Bean
	public DataSource getDataSource()
	{
		
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/spring_jdbc");
		dataSource.setUsername("root");
		dataSource.setPassword("91028");
		return dataSource;
			
	}
	
	@Bean("jdbc")
	public JdbcTemplate getJdbcTemplate()
	{
		JdbcTemplate jd=new JdbcTemplate();
		jd.setDataSource(getDataSource());;
		return jd;
	
	}
	
	/*
	 * @Bean("stDao") public StudentDao studentDao() { StudentDaoImpl dao=new
	 * StudentDaoImpl(); dao.setJdbcTemplate(getJdbcTemplate()); return dao; }
	 */
	
}






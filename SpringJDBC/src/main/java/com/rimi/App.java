package com.rimi;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext ac =new ClassPathXmlApplicationContext("application.xml");
//		JdbcTemplate jdbcTemplate=(JdbcTemplate)ac.getBean("jt");
//		System.out.println(jdbcTemplate);
		
		DataSource ds=(DataSource)ac.getBean("datasource");
		System.out.println(ds);
	}
}

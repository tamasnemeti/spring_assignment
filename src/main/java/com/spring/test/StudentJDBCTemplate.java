package com.spring.test;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate implements StudentDAO {
   private DataSource dataSource;
   private JdbcTemplate jdbcTemplateObject;
   
   public void setDataSource(DataSource dataSource) {
      this.dataSource = dataSource;
      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
   }
   public void create(String name, String bd, String neptun) {
      String SQL = "insert into Student (name, bd, neptun) values (?, ?, ?)";
      jdbcTemplateObject.update(SQL, name, bd, neptun);
      return;
   }
}
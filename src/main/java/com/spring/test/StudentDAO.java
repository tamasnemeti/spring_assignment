package com.spring.test;

import javax.sql.DataSource;

public interface StudentDAO {
   /*This is the method to be used to initialise database resources ie. connection.*/
   public void setDataSource(DataSource ds);
   
   /*This is the method to be used to create a record in the Student table.*/
   public void create(String name, String bd, String neptun);
}
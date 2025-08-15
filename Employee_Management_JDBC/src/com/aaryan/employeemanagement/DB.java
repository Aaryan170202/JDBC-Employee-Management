package com.aaryan.employeemanagement;

//1. Import Package - Done automatically
import java.sql.Connection;
import java.sql.DriverManager;


public class DB {
	
	//2. Load Driver - Optional(After JDBC_v4 (JDBC 6.0) it is done automatically
	//Class.forName("oracle.jdbc.driver.OracleDriver");
	
	//3. Register Driver - Optional(After JDBC_v4 (JDBC 6.0) it is done automatically
	
	static Connection conn = null;
	
	public static Connection connect() {
	
	try {
		String url = "jdbc:mysql://localhost:3306/employee";
		String userName = "root";
		String password = "abc000";
		
		//4. Create connection
		conn = DriverManager.getConnection(url,userName,password);
		
	}catch(Exception e){
		e.printStackTrace();
	}
	
	return conn;
	
	}

}

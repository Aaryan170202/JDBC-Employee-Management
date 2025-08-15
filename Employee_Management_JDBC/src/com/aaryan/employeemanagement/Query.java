package com.aaryan.employeemanagement;

public class Query {
	
	static String insert = "INSERT INTO employee VALUES (?,?,?,?)";
	static String update = "UPDATE employee SET name = ? WHERE id = ?";
	static String delete = "DELETE from employee WHERE id = ?";
	static String select = "SELECT * FROM employee";

}

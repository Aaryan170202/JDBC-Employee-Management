package com.aaryan.employeemanagement;

//1. Import Package - Done automatically
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmployeeDao {
	
		//2. Load Driver - Optional(After JDBC_v4 (JDBC 6.0) it is done automatically
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//3. Register Driver - Optional(After JDBC_v4 (JDBC 6.0) it is done automatically

	public static void createEmployee(Employee emp) throws SQLException {
		
		//4. Create connection
		Connection con = DB.connect();
		String query = Query.insert;
		
		//5. Create Statement
		PreparedStatement pstm = con.prepareStatement(query);		
		pstm.setInt(1, emp.getId());
		pstm.setString(2, emp.getName());
		pstm.setString(3, emp.getEmail());
		pstm.setInt(4, emp.getSalary());		
		System.out.println("\n ps = "+ pstm +"\n" + emp);
		
		//6. Execute Query
		//pstm.execute();
		pstm.executeUpdate();
		
		//7.connection close
		con.close();	
		
	}


	public static ArrayList<Employee> readAllEmployee() throws SQLException {
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		
		//4. Create connection
		Connection con = DB.connect();
		String query = Query.select;
		
		//5. Create Statement
		Statement stm = con.createStatement();
		System.out.println("\n st = "+ stm );
		
		//6. Execute Query
		ResultSet rs = stm.executeQuery(query);
		
		while(rs.next()) {

			Employee emp = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
			empList.add(emp);
		}
				
		//7.connection close
		con.close();
		
		
		return empList;
	}


	public static void updateEmployee(int id, String name) throws SQLException {

		//4. Create connection
		Connection con = DB.connect();
		String query = Query.update;
		
		//5. Create Statement
		PreparedStatement pstm = con.prepareStatement(query);		
		pstm.setInt(2, id);
		pstm.setString(1, name);		
		System.out.println("\n ps = "+ pstm);
				
		//6. Execute Query
		//pstm.execute();
		pstm.executeUpdate();
				
		//7.connection close
		con.close();
		
	}


	public static void deleteEmployee(int id) throws SQLException {

		//4. Create connection
				Connection con = DB.connect();
				String query = Query.delete;
				
				//5. Create Statement
				PreparedStatement pstm = con.prepareStatement(query);		
				pstm.setInt(1, id);		
				System.out.println("\n ps = "+ pstm);
						
				//6. Execute Query
				//pstm.execute();
				pstm.executeUpdate();
						
				//7.connection close
				con.close();
		
	}

}

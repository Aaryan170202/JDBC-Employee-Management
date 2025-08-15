package com.aaryan.employeemanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws Exception {
		
		while(true) {

		System.out.println("\n Employee Management");
		System.out.println("1 = Create , 2 = Read, 3 Update, 4 Delete ");
		Scanner sc= new Scanner(System.in);
		int choice = sc.nextInt();
		
		if (choice < 1 || choice > 4) break;
		
		switch(choice) {
		
		case 1:
			System.out.println(" id, name, email, salary");
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			String email = sc.nextLine();
			int salary = sc.nextInt();
			
			Employee emp = new Employee(id,name,email,salary);
			
			EmployeeDao.createEmployee(emp);
			break;
			
		case 2:
			ArrayList<Employee> List = EmployeeDao.readAllEmployee();
			for (Employee employee : List) {
				System.out.println(employee);
			}
			break;
			
		case 3:
			System.out.println("id & name");
			id = sc.nextInt();
			sc.nextLine();
			name = sc.nextLine();
			EmployeeDao.updateEmployee(id, name);
			break;
			
		case 4:
			System.out.println("id");
			id=sc.nextInt();
			EmployeeDao.deleteEmployee(id);
			break;
			
		}
		}

	}

}

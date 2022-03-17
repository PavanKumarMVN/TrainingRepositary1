package com.capg;

public class Employee 
{
			int EmployeeId;
			String EmployeeName;
			public Employee(int empid, String empname ) {
			EmployeeId=empid;
			EmployeeName=empname;
			}
			public void acceptdetails() {
			// method to accept the details of employee
			}
			public void displaydetails() {
			System.out.println(EmployeeId);
			System.out.println(EmployeeName);
			}
}
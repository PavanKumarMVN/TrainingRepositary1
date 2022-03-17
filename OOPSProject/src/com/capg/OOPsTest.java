package com.capg;

import java.util.Scanner;

public class OOPsTest 
{
	public static void main(String[] args) 
	{
		System.out.println("Working on OOPs");
		int empid;
		String empname;
		System.out.println("Working on OOPs");
		Employee employee1=new Employee(101, "Gopinath");
		employee1.displaydetails();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter EmployeeId and EmployeeName");
		empid=sc.nextInt();
		empname=sc.next();

		Employee employee3=new Employee(empid, empname);
		employee3.displaydetails();
	}
}

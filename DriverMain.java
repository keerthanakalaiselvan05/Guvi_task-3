package com.guvi.task3;

import java.util.Scanner;

public class DriverMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee Name :");
		String name=sc.next();
		System.out.println("Enter the Employee ID");
		int empID=sc.nextInt();
		System.out.println("Enter the Employee Salary");
        double salary=sc.nextDouble();
        Employee employee=new Employee(name,empID,salary);
        double incomeTax=employee.calcTax(employee.getSalary());
        System.out.println("Enter the Product ID :");
        int pID=sc.nextInt();
        System.out.println("Enter the Product Price :");
        double price=sc.nextDouble();
        System.out.println("Enter the Product Quantity :");
        int quantity=sc.nextInt();
		Product product=new Product(pID,price,quantity);
		double salesTax=product.calcTax(product.getPrice());
		System.out.println("Employee Details :");
		System.out.println("Name : "+name);
		System.out.println("ID : "+empID);
		System.out.println("Salary : "+salary);
		System.out.println("Income tax on yearly salary : "+incomeTax);
		System.out.println("Product Details :");
		System.out.println("Product ID : "+pID);
		System.out.println("Product Price : "+price);
		System.out.println("Product Quantity : "+quantity);
		System.out.println("Sales tax on unit price of product : "+salesTax);
		sc.close();
	}

}

/*
Output:
	
	    Enter the Employee Name :
		Keerthana
		Enter the Employee ID
		9612
		Enter the Employee Salary
		35000
		Enter the Product ID :
		100
		Enter the Product Price :
		500
		Enter the Product Quantity :
		5
		Employee Details :
		Name : Keerthana
		ID : 9612
		Salary : 35000.0
		Income tax on yearly salary : 3675.0
		Product Details :
		Product ID : 100
		Product Price : 500.0
		Product Quantity : 5
		Sales tax on unit price of product : 35.0
*/


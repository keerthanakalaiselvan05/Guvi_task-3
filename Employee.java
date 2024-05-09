package com.guvi.task3;

class Employee implements Taxable{
	
	private int empID;
	private String name;
	private double salary;
	
	public Employee(String name,int empID,  double salary) {
		
		this.name = name;
		this.empID = empID;
		this.salary = salary;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double calcTax(double salary) {
   	return incomeTax*salary;
   }
}

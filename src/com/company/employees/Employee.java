package com.company.employees;

public class Employee {
	protected int id;
	protected String firstName;
	protected String secondName;
	protected int age;
	protected int salary;
	protected int companyId;
	public Employee(int id, String firstName, String secondName, int age, int salary, int companyId) {
		this.id = id;
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
		this.salary = salary;
		this.companyId = companyId;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", secondName=" + secondName + ", age=" + age
				+ ", salary=" + salary + "]";
	}
	
}

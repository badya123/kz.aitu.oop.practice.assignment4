package com.company;

import java.util.ArrayList;
import java.util.List;

import com.company.employees.Employee;
import com.company.managers.Manager;

public class Company {
	private int id;
	private String name;
	private String location;
	private String directionCompany;
	private List<Employee> employees = new ArrayList<Employee>();
	private List<Manager> managers = new ArrayList<Manager>();
	public Company(int id, String name, String location, String directionCompany) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.directionCompany = directionCompany;
	}
	public int calculateTotalProjectPrice() {
		int price = 0;
		for(int i = 0; i < employees.size(); i++) {
			price += 500;
		}
		for(int i = 0; i < managers.size(); i++) {
			price += 700;
		}
		return price;
	}
	public List<Manager> getManagers() {
		return managers;
	}
	public void setManagers(List<Manager> managers) {
		this.managers = managers;
	}
	
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDirectionCompany() {
		return directionCompany;
	}
	public void setDirectionCompany(String directionCompany) {
		this.directionCompany = directionCompany;
	}
	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", location=" + location + ", directionCompany="
				+ directionCompany + "]";
	}
	
	
}

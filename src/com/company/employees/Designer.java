package com.company.employees;

public class Designer extends Employee {
	private String prototyping;
	private String mindmap;
	public Designer(int id, String firstName, String secondName, int age, int salary, int companyId, String prototyping,
			String mindmap) {
		super(id, firstName, secondName, age, salary, companyId);
		this.prototyping = prototyping;
		this.mindmap = mindmap;
	}
	public String getPrototyping() {
		return prototyping;
	}
	public void setPrototyping(String prototyping) {
		this.prototyping = prototyping;
	}
	public String getMindmap() {
		return mindmap;
	}
	public void setMindmap(String mindmap) {
		this.mindmap = mindmap;
	}
	@Override
	public String toString() {
		return "Designer [prototyping=" + prototyping + ", mindmap=" + mindmap + ", id=" + id + ", firstName="
				+ firstName + ", secondName=" + secondName + ", age=" + age + ", salary=" + salary + "]";
	}
 
	

}

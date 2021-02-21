package com.company.employees;

public class Engineer extends Employee {
	private String fixDiagnostics;
	private String customization;
	public Engineer(int id, String firstName, String secondName, int age, int salary, int companyId, String fixDiagnostics, String customization) {
		super(id, firstName, secondName, age, salary, companyId);
		this.fixDiagnostics = fixDiagnostics;
		this.customization = customization;
	}
	public String getFixDiagnostics() {
		return fixDiagnostics;
	}
	public void setFixDiagnostics(String fixDiagnostics) {
		this.fixDiagnostics = fixDiagnostics;
	}
	public String getCustomization() {
		return customization;
	}
	public void setCustomization(String customization) {
		this.customization = customization;
	}
	@Override
	public String toString() {
		return "Engineer [fixDiagnostics=" + fixDiagnostics + ", customization=" + customization + "]";
	}
	
}

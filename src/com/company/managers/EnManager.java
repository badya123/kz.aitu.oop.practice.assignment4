package com.company.managers;

public class EnManager implements Manager {
	
	private int id;
	private String firstName;
	private String secondName;
	private String phoneNumber;
	private int salary;
	private int company_id;
	
	/**
	 * @param id
	 * @param firstName
	 * @param secondName
	 * @param phoneNumber
	 * @param salary
	 */
	public EnManager(int id, String firstName, String secondName, String phoneNumber, int salary, int company_id) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.secondName = secondName;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
		this.company_id = company_id;
	}
	
	/**
	 * @return the id
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the firstName
	 */
	@Override
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the secondName
	 */
	@Override
	public String getSecondName() {
		return secondName;
	}

	/**
	 * @param secondName the secondName to set
	 */
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	/**
	 * @return the phoneNumber
	 */
	@Override
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the salary
	 */
	@Override
	public int getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getCompany_id() {
		return company_id;
	}
	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}

	@Override
	public String toString() {
		return "EnManager [id=" + id + ", firstName=" + firstName + ", secondName=" + secondName + ", phoneNumber="
				+ phoneNumber + ", salary=" + salary + "]";
	}

	
}

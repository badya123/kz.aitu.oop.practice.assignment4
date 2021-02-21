package com.company.controllers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.company.Company;
import com.company.employees.Designer;
import com.company.employees.Employee;
import com.company.employees.Engineer;
import com.company.interfaces.IDB;
import com.company.managers.DesManager;
import com.company.managers.Manager;
 

public class CompanyController {
		private final IDB db;
		public CompanyController(IDB db) {
			this.db = db;
	}
		public List<Company> getAllCompanies() {
			
			 Connection con = null;
		        try {
		            con = db.getConnection();
		            String sql = "SELECT * FROM company";
		            Statement st = con.createStatement();

		            ResultSet rs = st.executeQuery(sql);
		            List<Company> companies = new LinkedList<>();
		            while (rs.next()) {
		            	Company company = new Company(rs.getInt("company_id"), rs.getString("company_name"),
		            			rs.getString("company_location"), rs.getString("company_direction")
		                		);

		            	companies.add(company);
		            }

		            return companies;
		        } catch (SQLException throwables) {
		            throwables.printStackTrace();
		        } catch (ClassNotFoundException e) {
		            e.printStackTrace();
		        } finally {
		            try {
		                con.close();
		            } catch (SQLException throwables) {
		                throwables.printStackTrace();
		            }
		        }
		        return null;
		    }
		public List<Employee> getAllEmployees(String table) {
			
			 Connection con = null;
		        try {
		            con = db.getConnection();
		            String sql = "SELECT * FROM " + table;
		            Statement st = con.createStatement();

		            ResultSet rs = st.executeQuery(sql);
		            List<Employee> employees = new LinkedList<>();
		            while (rs.next()) {
		            	 if(table.equalsIgnoreCase("employee")) {
		            		 Employee employee = new Employee(rs.getInt("employee_id"),rs.getString("employee_first_name"),rs.getString("employee_second_name")
		            				  , rs.getInt("employee_age"), rs.getInt("employee_salary"), rs.getInt("company_id"));
		            		 employees.add(employee);		            		  
		            	 } else if(table.equalsIgnoreCase("designer")) {
		            		 Employee designer = new Designer(rs.getInt("designer_id"),rs.getString("designer_first_name"),rs.getString("designer_second_name")
		            				  , rs.getInt("designer_age"), rs.getInt("designer_salary"), rs.getInt("company_id"), rs.getString("designer_prototyping"), rs.getString("designer_mindmap"));
		            		 employees.add(designer);
		            	 } else if(table.equalsIgnoreCase("engineer")) {
		            		 Employee engineer = new Engineer(rs.getInt("engineer_id"),rs.getString("engineer_first_name"),rs.getString("engineer_second_name")
		            				  , rs.getInt("engineer_age"), rs.getInt("engineer_salary"), rs.getInt("company_id"), rs.getString("engineer_fix_diagnostics"), rs.getString("engineer_customization"));
		            		 employees.add(engineer);
		            	 }

		            	 
		            }

		            return employees;
		        } catch (SQLException throwables) {
		            throwables.printStackTrace();
		        } catch (ClassNotFoundException e) {
		            e.printStackTrace();
		        } finally {
		            try {
		                con.close();
		            } catch (SQLException throwables) {
		                throwables.printStackTrace();
		            }
		        }
		        return null;
		    }
		public List<Manager> getAllManagers() {
			
			 Connection con = null;
		        try {
		            con = db.getConnection();
		            String sql = "SELECT * FROM managers";
		            Statement st = con.createStatement();

		            ResultSet rs = st.executeQuery(sql);
		            List<Manager> managers = new LinkedList<>();
		            while (rs.next()) {
		            	  
		            	managers.add(new DesManager(rs.getInt("manager_id"), rs.getString("manager_firstname"), rs.getString("manager_secondname"), 
		            			rs.getString("manager_phonenumber"), rs.getInt("manager_salary"), rs.getInt("company_id")));
		            	
		            	 
		            }

		            return managers;
		        } catch (SQLException throwables) {
		            throwables.printStackTrace();
		        } catch (ClassNotFoundException e) {
		            e.printStackTrace();
		        } finally {
		            try {
		                con.close();
		            } catch (SQLException throwables) {
		                throwables.printStackTrace();
		            }
		        }
		        return null;
		    }
}

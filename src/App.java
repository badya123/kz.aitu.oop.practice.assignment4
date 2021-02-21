import java.util.List;

import com.company.Company;
import com.company.controllers.CompanyController;
import com.company.employees.Employee;
import com.company.managers.Manager;



public class App {
	public void start(CompanyController controller) {
		List<Company> companies = controller.getAllCompanies();
		List<Employee> employees = controller.getAllEmployees("employee");
		List<Employee> designers = controller.getAllEmployees("designer");
		List<Employee> engineers = controller.getAllEmployees("engineer");
		List<Manager> managers = controller.getAllManagers();
		
		for(int i = 0; i < companies.size(); i++) {
			for(int j = 0; j < employees.size(); j++) {
				if(companies.get(i).getId() == employees.get(j).getCompanyId()) {
					companies.get(i).getEmployees().add(employees.get(j));
				}
			}
			for(int k = 0; k < designers.size(); k++) {
				if(companies.get(i).getId() == designers.get(k).getCompanyId()) {
					companies.get(i).getEmployees().add(designers.get(k));
				}
			}
			for(int h = 0; h < engineers.size(); h++) {
				if(companies.get(i).getId() == engineers.get(h).getCompanyId()) {
					companies.get(i).getEmployees().add(engineers.get(h));
				}
			}
			for(int l = 0; l < managers.size(); l++) {
				if(managers.get(l).getCompany_id() == companies.get(i).getId()) {
					companies.get(i).getManagers().add(managers.get(l));
				}
			}
		}
		for(int i = 0; i < companies.size(); i++) {
			System.out.println(companies.get(i).calculateTotalProjectPrice());
		}
		
	}
}

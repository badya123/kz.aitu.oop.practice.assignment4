import com.company.controllers.CompanyController;
import com.company.data.PostgresDB;
import com.company.interfaces.IDB;



public class Main {
	public static void main(String[] args) {
		IDB pos = new PostgresDB();
		CompanyController controller = new CompanyController(pos);
		App app = new App();
		app.start(controller);
	}
}

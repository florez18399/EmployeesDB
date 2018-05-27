package controller;

import java.util.Calendar;
import java.util.GregorianCalendar;

import models.Department;
import models.Employee;
import models.Project;
import models.ProjectAllocation;
import models.ProjectAllocationPK;
import persistence.MyDB;

public class Controller {
	private static Controller controller;
	private MyDB myDB;

	private Controller() {

	}

	public static Controller getInstance() {
		if (controller == null)
			controller = new Controller();
		return controller;
	}

	public void initComponents() {
		myDB = new MyDB();
	}

	public void addDepartment() {
		// Department department = new Department("Finanzas", "8546", "Paipa");
		// Employee employee = new Employee("Andrés Felipe ", "Flórez Caro",
		// "3125837279",
		// new GregorianCalendar(18, 3, 1999), 0, department);
		// // department.getEmployees().add(employee);
		// myDB.saveDepartment(department);
		// myDB.saveEmployee(employee);
		// department.showEmployees();
		Department department = new Department("Administración 2", "3102500929", "Sogamoso");
		Employee employee = new Employee("Nicolás  ", "Mendez", "514648",
				new GregorianCalendar(2000, Calendar.JULY, 20), 15000, department);
		department.getEmployees().add(employee);
		myDB.saveDepartment(department);

		// Project project = new Project("Reforma de inventarios");
		// myDB.saveProject(project);
		//
		// ProjectAllocation allocation = new ProjectAllocation(
		// new ProjectAllocationPK(project.getIdProject(), employee.getIdEmployee()),
		// new GregorianCalendar(2015, Calendar.JULY, 26), new GregorianCalendar(2018,
		// Calendar.MARCH, 18));
		// myDB.saveProjectAllocation(allocation);
		// Project project = new Project("El juego del proyect :V");
		// myDB.saveProject(project);
		myDB.keepChanges();
	}

}

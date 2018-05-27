package persistence;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.resource.transaction.spi.TransactionStatus;

import models.Department;
import models.Employee;
import models.Project;
import models.ProjectAllocation;

public class MyDB {
	// private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;

	public MyDB() {
		session = new Configuration().configure("persistence/mydb.cfg.xml").buildSessionFactory().openSession();
		transaction = session.beginTransaction();
	}

	public void saveDepartment(Department department) {
		session.save(department);
	}

	public void saveEmployee(Employee employee) {
		session.save(employee);
	}

	public void keepChanges() {
		transaction.commit();
		session.close();
	}

	public void closeSession() {
		session.close();
	}

	public void saveProject(Project project) {
		session.save(project);
	}

	public void saveProjectAllocation(ProjectAllocation projectAllocation) {
		session.save(projectAllocation);
	}
}

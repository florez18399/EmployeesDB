package models;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

//@Entity
// @Table(name = "Departments")
public class Department {

	// @Id
	// @GeneratedValue(generator = "generator_id_dep")
	// @GenericGenerator(name = "generator_id_dep", strategy = "increment")
	// @Column(name = "id_department")
	private int idDepartment;
	// @Column(name = "name_department")
	private String nameDepartment;
	// @Column(name = "manager_number")
	private String managerNumber;
	// @Column(name = "location_name")
	private String locationName;
	// @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
	private Set<Employee> employees;

	public Department(String nameDepartment, String managerNumber, String locationName) {
		this.nameDepartment = nameDepartment;
		this.managerNumber = managerNumber;
		this.locationName = locationName;
		this.employees = new HashSet<>();
	}

	public Department(int idDepartment, String nameDepartment, String managerNumber, String locationName) {
		this.idDepartment = idDepartment;
		this.nameDepartment = nameDepartment;
		this.managerNumber = managerNumber;
		this.locationName = locationName;
		employees = new HashSet<>();
	}

	public Department() {
	}

	public int getIdDepartment() {
		return idDepartment;
	}

	public void setIdDepartment(int idDepartment) {
		this.idDepartment = idDepartment;
	}

	public String getNameDepartment() {
		return nameDepartment;
	}

	public void setNameDepartment(String nameDepartment) {
		this.nameDepartment = nameDepartment;
	}

	public String getManagerNumber() {
		return managerNumber;
	}

	public void setManagerNumber(String managerNumber) {
		this.managerNumber = managerNumber;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	public void showEmployees() {
		for (Employee employee : employees) {
			System.out.println(employee.getFirstName() + " " + employee.getLastName());
		}
	}

}

package models;

import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

//
//@Entity
// @Table(name = "Employees")
public class Employee {
	// @Id
	// @Column(name = "id_employee")
	// @GeneratedValue(generator = "generator_id_emp")
	// @GenericGenerator(name = "generator_id_emp", strategy = "increment")
	private int idEmployee;
	// @Column(name = "first_name")
	private String firstName;
	// @Column(name = "last_name")
	private String lastName;
	// @Column(name = "phone_number")
	private String phoneNumber;
	// @Column(name = "hired_date")
	// @Temporal(TemporalType.DATE)
	private Calendar hiredDate;
	// @Column(name = "current_salary")
	private int currentSalary;
	// @ManyToOne
	// @JoinColumn(name = "id_department")
	private Department department;

	public Employee() {
	}

	public Employee(String firstName, String lastName, String phoneNumber, Calendar hiredDate, int currentSalary,
			Department department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.hiredDate = hiredDate;
		this.currentSalary = currentSalary;
		this.department = department;
	}

	public int getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Calendar getHiredDate() {
		return hiredDate;
	}

	public void setHiredDate(Calendar hiredDate) {
		this.hiredDate = hiredDate;
	}

	public int getCurrentSalary() {
		return currentSalary;
	}

	public void setCurrentSalary(int currentSalary) {
		this.currentSalary = currentSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}

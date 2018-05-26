package models;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "Employees")
	@Column(name = "id_employee")
	private int idEmployee;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "phone_number")
	private String phoneNumber;
	@Column(name = "hired_date")
	private Calendar hiredDate;
	@Column(name = "current_salary")
	private int currentSalary;
	@ManyToOne
	private Department department;

	public Employee() {
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

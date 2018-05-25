package models;

public class Department {
	private int idDepartment;
	private String nameDepartment;
	private String managerNumber;
	private String locationName;

	public Department(int idDepartment, String nameDepartment, String managerNumber, String locationName) {
		this.idDepartment = idDepartment;
		this.nameDepartment = nameDepartment;
		this.managerNumber = managerNumber;
		this.locationName = locationName;
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

}

package models;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ProjectAllocationPK {
	@Column(name = "id_project", nullable = false)
	private int idProject;
	@Column(name = "id_employee", nullable = false)
	private int idEmployee;

	public ProjectAllocationPK(int idProject, int idEmployee) {
		this.idProject = idProject;
		this.idEmployee = idEmployee;
	}

	public ProjectAllocationPK() {
	}

	public int getIdProject() {
		return idProject;
	}

	public void setIdProject(int idProject) {
		this.idProject = idProject;
	}

	public int getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}

}

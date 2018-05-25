package models;

public class Project {
	private int idProject;
	private String nameProject;

	public Project() {
	}

	public Project(int idProject, String nameProject) {
		this.idProject = idProject;
		this.nameProject = nameProject;
	}

	public int getIdProject() {
		return idProject;
	}

	public void setIdProject(int idProject) {
		this.idProject = idProject;
	}

	public String getNameProject() {
		return nameProject;
	}

	public void setNameProject(String name) {
		this.nameProject = name;
	}

}

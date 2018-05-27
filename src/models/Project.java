package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Projects")
public class Project {
	@Id
	@GeneratedValue(generator = "generator_id_pro")
	@GenericGenerator(name = "generator_id_pro", strategy = "increment")
	@Column(name = "id_project")
	private int idProject;
	@Column(name = "name_project")
	private String nameProject;

	public Project() {
	}

	public Project(int idProject, String nameProject) {
		this.idProject = idProject;
		this.nameProject = nameProject;
	}

	public Project(String nameProject) {
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

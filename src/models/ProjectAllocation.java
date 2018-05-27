package models;

import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Table;

//Entidad débil
@Entity
@Table(name = "projects_allocation")
public class ProjectAllocation {
	@EmbeddedId
	private ProjectAllocationPK pk;
	@Column(name = "emp_start_date")
	@Temporal(TemporalType.DATE)
	private Calendar empStartDate;
	@Column(name = "emp_end_date")
	@Temporal(TemporalType.DATE)
	private Calendar empEndDate;

	public ProjectAllocation(ProjectAllocationPK pk, Calendar empStartDate, Calendar empEndDate) {
		this.pk = pk;
		this.empStartDate = empStartDate;
		this.empEndDate = empEndDate;
	}

	public ProjectAllocation() {
	}

	public ProjectAllocationPK getPk() {
		return pk;
	}

	public void setPk(ProjectAllocationPK pk) {
		this.pk = pk;
	}

	public Calendar getEmpStartDate() {
		return empStartDate;
	}

	public void setEmpStartDate(Calendar empStartDate) {
		this.empStartDate = empStartDate;
	}

	public Calendar getEmpEndDate() {
		return empEndDate;
	}

	public void setEmpEndDate(Calendar empEndDate) {
		this.empEndDate = empEndDate;
	}

}

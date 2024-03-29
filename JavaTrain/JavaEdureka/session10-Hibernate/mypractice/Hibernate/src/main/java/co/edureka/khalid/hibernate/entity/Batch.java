package co.edureka.khalid.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Batch {
	@Id
	@Column
	private Integer batchId;
	@Column
	private String course;
	//@Column
	@ManyToOne
	@JoinColumn(name="facultyId")
	private Faculty faculty;
	public Batch(Integer batchId, String course, Faculty faculty) {
		super();
		this.batchId = batchId;
		this.course = course;
		this.faculty = faculty;
	}
	public Integer getBatchId() {
		return batchId;
	}
	public void setBatchId(Integer batchId) {
		this.batchId = batchId;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Faculty getFaculty() {
		return faculty;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	

}

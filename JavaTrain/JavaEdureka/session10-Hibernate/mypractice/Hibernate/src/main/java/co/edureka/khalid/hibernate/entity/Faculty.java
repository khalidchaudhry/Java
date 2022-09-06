package co.edureka.khalid.hibernate.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Faculty {
	@Id
	@GeneratedValue
	@Column
	private int facultyId;
	@Column
	private String facultyName;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "facultyId")
	private Set<Batch> batches;

	public Faculty(String facultyName) {
		super();
		this.facultyName = facultyName;
	}

	public int getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public Set<Batch> getBatches() {
		return batches;
	}

	public void setBatches(Set<Batch> batches) {
		this.batches = batches;
	}

}

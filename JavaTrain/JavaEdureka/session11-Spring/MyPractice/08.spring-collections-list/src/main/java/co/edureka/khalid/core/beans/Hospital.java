package co.edureka.khalid.core.beans;

import java.util.List;
import java.util.Set;

public class Hospital {
	private String hospitalName;
	private List<String> departments;

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public List<String> getDepartments() {
		return departments;
	}

	public void setDepartments(List<String> departments) {
		this.departments = departments;
	}

}

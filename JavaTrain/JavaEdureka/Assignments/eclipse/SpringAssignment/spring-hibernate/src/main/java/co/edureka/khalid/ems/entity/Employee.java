package co.edureka.khalid.ems.entity;

public class Employee {
	

	private Integer employeeId;
	private String employeeName;
	private Integer Basic;
	private Integer HRA;
	private Integer DA;
	private Integer Deductions;
	public Employee() 
	{
		
		
	}
	public Employee(String employeeName, Integer basic, Integer hRA, Integer dA, Integer deductions) {
		this.employeeName = employeeName;
		Basic = basic;
		HRA = hRA;
		DA = dA;
		Deductions = deductions;
	}
	
	public Employee(Integer employeeId, String employeeName, Integer basic, Integer hRA, Integer dA,
			Integer deductions) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		Basic = basic;
		HRA = hRA;
		DA = dA;
		Deductions = deductions;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Integer getBasic() {
		return Basic;
	}

	public void setBasic(Integer basic) {
		Basic = basic;
	}

	public Integer getHRA() {
		return HRA;
	}

	public void setHRA(Integer hRA) {
		HRA = hRA;
	}

	public Integer getDA() {
		return DA;
	}

	public void setDA(Integer dA) {
		DA = dA;
	}

	public Integer getDeductions() {
		return Deductions;
	}

	public void setDeductions(Integer deductions) {
		Deductions = deductions;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", Basic=" + Basic + ", HRA="
				+ HRA + ", DA=" + DA + ", Deductions=" + Deductions + ", Gross Salary=" + (Basic+HRA+DA) +
				", Net salary="+((Basic+HRA+DA)-Deductions)+"]";
	}
	
	

	

	
}


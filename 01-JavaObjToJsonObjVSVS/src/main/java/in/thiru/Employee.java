package in.thiru;

public class Employee {

	private Integer empId;
	private String empName;
	private Double empSal;
	private String empLoc;

	public Employee(Integer empId, String empName, Double empSal, String empLoc) {

		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empLoc = empLoc;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}

	public String getEmpLoc() {
		return empLoc;
	}

	public void setEmpLoc(String empLoc) {
		this.empLoc = empLoc;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empLoc=" + empLoc + "]";
	}

}

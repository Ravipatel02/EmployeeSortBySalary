package treeSetComprator.sortWithSalary;

public class Employee implements Comparable<Employee> {
	
	private int empId;
	private int empSal;
	private String empName;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, int empSal, String empName) {
		super();
		this.empId = empId;
		this.empSal = empSal;
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empSal=" + empSal + ", empName=" + empName + "]";
	}
	
//	@Override
//	public boolean equals(Object o) {
//		if(this == o) {
//			return true;
//		}
//		Employee e1 = this;
//		Employee e2 = (Employee)o;
//		
//		return e1.empId == e2.empId && e1.empSal == e2.empSal && e1.empName.equals(e2.empName);
//		
//	}
//	
//	@Override
//	public int hashCode() {
//		return empId;
//	}

	@Override
	public int compareTo(Employee o) {
		if(this.empSal>o.empSal) {
			return 1;
		}else if(this.empSal<o.empSal) {
			return -1;
		}else {
			return empName.compareTo(o.empName);
		}
		
	}
	
	
	
	public void print() {
		System.out.println("Employee [empId=" + empId + ", empSal=" + empSal + ", empName=" + empName + "]");
	}
	
	
	
	

}

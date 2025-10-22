package exam1020;

public abstract class Employee {
	//필드
	protected String name;	//직원 이름
	protected String employeeId;	//직원 아이디
	
	protected Employee(String name, String employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}
	
	 public abstract int calculatePay();

	 public String getName() {
		 return name;
	 }

	 public void setName(String name) {
		 this.name = name;
	 }

	 public String getEmployeeId() {
		 return employeeId;
	 }

	 public void setEmployeeId(String employeeId) {
		 this.employeeId = employeeId;
	 }
	 
	 
}

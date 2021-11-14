package ch08;

public class Employee {
	//Static 공부
	private static int serialNum=1000;
	

	
	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee() {
		serialNum++;
		employeeId = serialNum;
	}
	//Private라서 getter를 만들어줌
	public static int getSerialNum() {
		//지역변수는 가능
		int i=0;
		//Static안에서는 아래처럼 사용할수없다. (Static이 아닌 필드에서는 사용가능하다)
		//employeeName = "Lee";
		return serialNum;
	}

	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
}

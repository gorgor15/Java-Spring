package ch08;

public class Employee {
	//Static ����
	private static int serialNum=1000;
	

	
	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee() {
		serialNum++;
		employeeId = serialNum;
	}
	//Private�� getter�� �������
	public static int getSerialNum() {
		//���������� ����
		int i=0;
		//Static�ȿ����� �Ʒ�ó�� ����Ҽ�����. (Static�� �ƴ� �ʵ忡���� ��밡���ϴ�)
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

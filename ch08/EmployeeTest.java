package ch08;

public class EmployeeTest {
	//Static ����
	public static void main(String[] args) {
		Employee employeeLee = new Employee();		
		employeeLee.setEmployeeName("Lee");
		System.out.println(employeeLee.getEmployeeName()+"���� �����"+employeeLee.getEmployeeId());
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("Kim");
//		employeeLee.serialNum++;
		System.out.println(employeeKim.getEmployeeName()+"���� �����"+employeeKim.getEmployeeId());
		
		//Employee�� serialNum���� private�� �������� �Ʒ�ó�� ����ϸ� �������
//		System.out.println(employeeLee.serialNum);
		
		Employee employeeJ = new Employee();
		employeeJ.setEmployeeName("J");
		System.out.println(employeeJ.getEmployeeName()+"���� �����"+employeeJ.getEmployeeId());
	}
}

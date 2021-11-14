package ch08;

public class EmployeeTest {
	//Static 공부
	public static void main(String[] args) {
		Employee employeeLee = new Employee();		
		employeeLee.setEmployeeName("Lee");
		System.out.println(employeeLee.getEmployeeName()+"님의 사번은"+employeeLee.getEmployeeId());
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("Kim");
//		employeeLee.serialNum++;
		System.out.println(employeeKim.getEmployeeName()+"님의 사번은"+employeeKim.getEmployeeId());
		
		//Employee에 serialNum값을 private를 만들어놔서 아래처럼 사용하면 에러출력
//		System.out.println(employeeLee.serialNum);
		
		Employee employeeJ = new Employee();
		employeeJ.setEmployeeName("J");
		System.out.println(employeeJ.getEmployeeName()+"님의 사번은"+employeeJ.getEmployeeId());
	}
}

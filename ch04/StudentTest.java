package ch04;

public class StudentTest {
	public static void main(String[] args) {
		
		
		Student student = new Student();
		
		student.studentId=13245;
		student.setStudentName("LEE");
		student.address = "���� ������";
		
		student.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentId = 12345;
		studentKim.studentName="Kim";
		studentKim.address="��⵵ ������";
		
		studentKim.showStudentInfo();
	}
}

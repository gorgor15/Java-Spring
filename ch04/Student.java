package ch04;

public class Student {

	int studentId;
	String studentName;
	String address;
	
	public void showStudentInfo() {
		System.out.println(studentId+"�й��� �̸���"+studentName+"�̰�, �ּҴ�"+address+"�Դϴ�.");
	}

	

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String Name) {
		studentName = Name;
	}

	
	
	
}

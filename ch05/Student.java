package ch05;

public class Student {
	
	public int studentNumber;
	public int grade;
	public String studentName;
	
	public Student() {
		
	}
	public Student(int studentNumber,String studentName,int grade) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}
	public String showStudentInfo() {
		
		return studentName+ "�л��� �й���"+ studentNumber + " �̰�," + grade + "�г� �Դϴ�.";
	}
	
}

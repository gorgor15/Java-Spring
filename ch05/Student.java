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
		
		return studentName+ "학생의 학번은"+ studentNumber + " 이고," + grade + "학년 입니다.";
	}
	
}

package ch06;

public class Student {
	String studentName;
	int studentId;
	
	Subject korea;
	Subject math;
	
	public Student(String studentName,int studentId) {
		this.studentId=studentId;
		this.studentName=studentName;
		
		korea = new Subject();
		math = new Subject();
		
	}
	
	public void setKoreaSubject(String name,int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	public void setMathSubject(String name,int score) {
		math.subjectName=name;
		math.score=score;
		
	}
	
	public void showInfo() {
		int total = korea.score+math.score;
		System.out.println(studentName+"¥‘¿« √—¡°¿∫"+total+"¿‘¥œ¥Ÿ");
	}
}

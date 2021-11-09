package ch05;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentKim = new Student();
		Student studentLee = new Student(1234,"lee",3);
		
		System.out.println(studentLee.showStudentInfo());
		System.out.println(studentKim.showStudentInfo());
	}

}

package ch06;


public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student("Lee",1);
		studentLee.setKoreaSubject("국어", 100);
		studentLee.setMathSubject("수학", 95);
			
		Student studentKim = new Student("Kim",2);
		studentKim.setKoreaSubject("국어", 90);
		studentKim.setMathSubject("수학",75);
		
		studentLee.showInfo();
		studentKim.showInfo();
	}
}

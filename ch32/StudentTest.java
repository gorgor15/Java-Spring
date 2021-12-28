package ch32;

import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		MyLogger myLogger = MyLogger.getLogger();
		Scanner a = new Scanner(System.in);
		String name=a.next();
		
		try {
			Student student = new Student(name);
			System.out.println(name+"는 오류없음");
		}catch(StudentNaemeFormatException e) {
			myLogger.warning(e.getMessage());
		}
		
		try {
			Student student = new Student("Edward Jon Kim test");
		}catch(StudentNaemeFormatException e) {
			myLogger.warning(e.getMessage());
		}
		
		Student student = new Student("James");
	}
}

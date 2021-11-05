package ch02;

public class test1 {

	public static void main(String[] args) {
		int score = 80;
		
		if(score>=90) {
			System.out.println(score+"는 A학점입니다.");
		}
		else if(score>=80) {
			System.out.println(score+"는 B학점입니다.");
		}
		else if(score>=70) {
			System.out.println(score+"는 C학점입니다.");
		}
		else {
			System.out.println(score+"는 F학점입니다.");
		}
	}
}

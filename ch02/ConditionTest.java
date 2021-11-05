package ch02;

import java.util.Scanner;

public class ConditionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int max;
		System.out.println("두 수를 입력받아 더 큰 수를 입력하세요\n");
		
		Scanner a = new Scanner(System.in);
		System.out.println("입력1");
		int num1 = a.nextInt();
		System.out.println("입력2");
		int num2 = a.nextInt();
		
		max=(num1>num2)?num1:num2;
		System.out.println(max);
	
	}

}

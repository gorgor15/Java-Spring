package ch02;

import java.util.Scanner;

public class ConditionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int max;
		System.out.println("�� ���� �Է¹޾� �� ū ���� �Է��ϼ���\n");
		
		Scanner a = new Scanner(System.in);
		System.out.println("�Է�1");
		int num1 = a.nextInt();
		System.out.println("�Է�2");
		int num2 = a.nextInt();
		
		max=(num1>num2)?num1:num2;
		System.out.println(max);
	
	}

}

package ch03;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		int input;
		int sum=0;
		
		
		
		 do{
			input=a.nextInt();
			sum+=input;
		}while(input!=0);
		System.out.println(sum);
	}

}

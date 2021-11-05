package ch01;

public class DoubleTest02 {
	public static void main(String[] args) {
		double dnum = 1;
		for(int i=0;i<10000;i++)
			dnum+=0.1;
		
		System.out.println(dnum);
	}
}

package ch02;

public class TypeConversionTest {
	public static void main(String[] args) {
//		long bNum = 125;
//		int iNum = (int)bNum;
//		
//		int aNum = 255;
//		byte btNum = (byte)aNum;
//		System.out.println(iNum);
//		System.out.println(btNum);
		
		double dnum=1.2;
		float fNum=0.9F;
		
		int iNum1 = (int)dnum+(int)fNum;
		int iNum2 = (int)(dnum+fNum);
		System.out.println(iNum1);
		System.out.println(iNum2);
		
		int myNum=10;
		int yourNum=5;
		
		myNum <<=yourNum;
		System.out.println(myNum);
		
	}
}

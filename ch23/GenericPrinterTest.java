package ch23;

public class GenericPrinterTest {
	public static void main(String[] args) {
		// T ��� �ڷ��� Ÿ���� �����ָ�ȴ�.
		//GenericPrinter<T> 
		// <T> �� �������شٸ� Powder p =(Powder) powderPrinter.getMaterial(); �̷��� ����ߵȴ�. 
		Powder powder = new Powder();
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		
		powderPrinter.setMaterial(powder);
		
		Powder p = powderPrinter.getMaterial();
		
		
		System.out.println(powder.toString());
	}
}

package ch23;

public class GenericPrinterTest {
	public static void main(String[] args) {
		// T 대신 자료형 타입을 적어주면된다.
		//GenericPrinter<T> 
		// <T> 를 안적어준다면 Powder p =(Powder) powderPrinter.getMaterial(); 이렇게 해줘야된다. 
		Powder powder = new Powder();
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		
		powderPrinter.setMaterial(powder);
		
		Powder p = powderPrinter.getMaterial();
		
		
		System.out.println(powder.toString());
	}
}

package ch08;

public class CarFactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarFactory factory = CarFactory.getInstance();
		Car mySonata = factory.createCar();
		Car yourSonata = factory.createCar();
		Car Sonata =factory.createCar();
		
		System.out.println(mySonata.getCarId()); //10001���
		System.out.println(yourSonata.getCarId()); //10002���
		System.out.println(Sonata.getCarId()); //10003���
	}

}

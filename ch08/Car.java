package ch08;

public class Car {
	private static int serialNum = 10000;
	
	private int CarId;
	
	
	public Car() {
		serialNum++;
		CarId = serialNum;
	}
	public static int getSerialNum() {
		return serialNum;
	}
	
	public int getCarId() {
		return CarId;
	}

	public void setCarId(int carId) {
		CarId = carId;
	}

	
	
	
	
}

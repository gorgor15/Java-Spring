package ch14;

public class ManualCar extends Car{

	@Override
	void drive() {
		// TODO Auto-generated method stub
		System.out.println("사람이 운전합니다.");
		System.out.println("사람이 핸들을 조작합니다.");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		
		System.out.println("장애물 앞에서 브레이크를 밟아서 멈춥니다.");
	}

	@Override
	void wiper() {
		// TODO Auto-generated method stub
		System.out.println("비가와서 와이퍼를 작동시킵니다.");
	}
	
}

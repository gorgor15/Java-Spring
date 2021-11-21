package ch14;

public class AICar extends Car{

	@Override
	void drive() {
		System.out.println("자율 주행을 합니다.");
		System.out.println("자동차가 스스로 움직입니다");
	}
	
	@Override
	void stop() {
		// TODO Auto-generated method stub
		
		System.out.println("자동차가 멈춥니다.");
	}

	@Override
	void wiper() {
		// TODO Auto-generated method stub
		System.out.println("비가 내려서 와이퍼가 작동합니다.");
	}

	@Override
	public void washCar() {
		// TODO Auto-generated method stub
		System.out.println("자동세차를 시작합니다.");
	}
	
}

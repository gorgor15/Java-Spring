package programming;

public class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		// TODO Auto-generated method stub
		System.out.println("우선순위가 가장높은 고객을 우선하는 상담원을 연결합니다.");
	}

	@Override
	public void sendCallToAgent() {
		// TODO Auto-generated method stub
		System.out.println("업무 숙련도가 높은 상담원에게 먼저 배분합니다");
	}

}

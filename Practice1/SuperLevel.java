package Practice.Practice1;

public class SuperLevel extends PlayerLevel{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("��û ������ �޸��ϴ�.");
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("���� ���� Jump �մϴ�.");
	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub
		System.out.println("turn �մϴ�");
	}

	@Override
	public void showLevelMessage() {
		// TODO Auto-generated method stub
		System.out.println("****** ����� �����Դϴ�. ******");
	}
}

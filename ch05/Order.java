package ch05;

public class Order {
	String OrderId;
	String OrderNumber;
	String OrderAddress;
	String OrderDate;
	String OrderTime;
	int OrderPrice;
	String OrderMenuId;
	
	public Order() {
		
	}
	
	
	public void showOrderDetail() {
		System.out.println("�ֹ� ���� ��ȣ : "+OrderId);
		System.out.println("�ֹ� �ڵ��� ��ȣ : "+OrderNumber);
		System.out.println("�ֹ� �� �ּ� : "+OrderAddress);
		System.out.println("�ֹ� ��¥ : "+OrderDate);
		System.out.println("�ֹ� �ð� : "+OrderTime);
		System.out.println("�ֹ� ���� : "+OrderPrice);
		System.out.println("�޴� ��ȣ : "+OrderMenuId);
		
	}
}

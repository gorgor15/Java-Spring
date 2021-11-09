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
		System.out.println("주문 접수 번호 : "+OrderId);
		System.out.println("주문 핸드폰 번호 : "+OrderNumber);
		System.out.println("주문 집 주소 : "+OrderAddress);
		System.out.println("주문 날짜 : "+OrderDate);
		System.out.println("주문 시간 : "+OrderTime);
		System.out.println("주문 가격 : "+OrderPrice);
		System.out.println("메뉴 번호 : "+OrderMenuId);
		
	}
}

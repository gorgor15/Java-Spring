package ch05;

public class OrderTest {

	public static void main(String[] args) {
		Order order = new Order();
		order.OrderId="202011020003";
		order.OrderNumber="01023450001";
		order.OrderAddress="����� ������ ���ﵿ 111-333";
		order.OrderDate="20201102";
		order.OrderTime="130258";
		order.OrderPrice=35000;
		order.OrderMenuId="0003";
		order.showOrderDetail();
		System.out.println();

	}

}

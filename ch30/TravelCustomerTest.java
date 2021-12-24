package ch30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TravelCustomerTest {
	public static void main(String[] args) {
		Customer customerL = new Customer("�̰ǿ�", 25, 100);
		Customer customerK = new Customer("������",25,100);
		Customer customerJ = new Customer("������",12,50);
		
		List<Customer> list = new ArrayList<Customer>();
		list.add(customerL);
		list.add(customerK);
		list.add(customerJ);
		
		System.out.println("�� ��� ���");
		list.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		System.out.println("���� �Ѻ�� ���");
		int sum = list.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println(sum);
		
		System.out.println("20�� �̻� �� ����");
		list.stream().filter(c->c.getAge()>=20).map(s->s.getName()).sorted().forEach(s->System.out.println(s));
	}
}

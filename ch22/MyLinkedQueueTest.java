package ch22;

public class MyLinkedQueueTest {
	public static void main(String[] args) {
		MyLinkedQueue queue = new MyLinkedQueue();
		
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		
		queue.printAll();
		
		//�� �տ��ִ°� ������
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
	}
}

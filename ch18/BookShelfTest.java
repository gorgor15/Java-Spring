package ch18;

public class BookShelfTest {
	public static void main(String[] args) {
		Queue bookQueue = new BookShelf();
		
		bookQueue.enQueue("토지1");
		bookQueue.enQueue("토지2");
		bookQueue.enQueue("토지3");
		bookQueue.enQueue("토지4");
		bookQueue.enQueue("토지5");
		
		System.out.println(bookQueue.getSize());
		for(int i=0;i<5;i++) {
		System.out.println(bookQueue.deQueue());
		}
	}
}

package ch38;

import java.util.ArrayList;

// wait() 하는것을 만들것이다.

class Book{
	public ArrayList<String> books = new ArrayList<String>();
	
	public Book() {
		books.add("태백산맥1");
		books.add("태백산맥2");
		books.add("태백산맥3");
		
	}
	
	public synchronized String lendBook() throws InterruptedException {
		Thread t = Thread.currentThread();
		while(books.size() == 0) {
			System.out.println(t.getName()+" waiting start");
			wait();
			System.out.println(t.getName()+" waiting end");
		}
		if(books.size() > 0 ) {
			String book = books.remove(0);
			System.out.println(t.getName()+book+"lend");
			return book;
		}else return null;
		
		
	}
	
	public synchronized void returnBook(String book) throws InterruptedException{
		Thread t = Thread.currentThread();
		books.add(book);
		notifyAll();
		System.out.println(t.getName()+book+" return");	
	}
}


class Students extends Thread{
	public Students(String name) {
		super(name);
	}
	@Override
	public void run() {
		try {
			String title = LibraryTest.booking.lendBook();
			if(title==null) {
				System.out.println(getName()+"빌리지 못했음");
				return;
			}
			Thread.sleep(1000);
			LibraryTest.booking.returnBook(title);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}



public class LibraryTest {
	public static Book booking = new Book();
	public static void main(String[] args) {
		Students std1 = new Students("std1");
		Students std2 = new Students("std2");
		Students std3= new Students("std3");
		Students std4 = new Students("std4");
		Students std5 = new Students("std5");
		Students std6 = new Students("std6");
		std1.start();
		std2.start();
		std3.start();
		std4.start();
		std5.start();
		std6.start();
	}
}

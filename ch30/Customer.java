package ch30;

import java.util.ArrayList;

public class Customer {
	private String name;
	private int age;
	private int price;
	
	ArrayList<String> customer;
	
	public Customer(String name,int age,int price) {
		this.name=name;
		this.age=age;
		this.price=price;
		
		customer = new ArrayList<String>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", price=" + price + "]";
	}
	
	
	
}

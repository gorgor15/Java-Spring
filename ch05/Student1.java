package ch05;

public class Student1 {
	int id;
	String name;
	String address;
	
	public void showInfo() {
		System.out.println(id+"학번이고 이름은"+name+"이고 주소는"+address+"입니다.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

package ch32;

public class Student {
	private String name;
	MyLogger myLogger = MyLogger.getLogger();
	
	public Student(String name) {
		if(name==null) {
			throw new StudentNaemeFormatException("name must not null");
		}
		if(name.split(" ").length>3)
			throw new StudentNaemeFormatException("이름이 너무 길어요");
		
		this.name = name;
	}
	
	public String getName() {
		myLogger.fine("begin getStudentName()");
		return name;
	}

	
	
}

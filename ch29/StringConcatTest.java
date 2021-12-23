package ch29;

public class StringConcatTest {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		/*
		StringConcatImpl concat = new StringConcatImpl();
		concat.makeString(s1, s2);
		*/
		
		StringConcat concats = (s,v) -> System.out.println(s+','+v);
		concats.makeString(s1, s2);
	
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				// TODO Auto-generated method stub
				System.out.println(s1+"...."+s2);
			}
		};
		
		concat2.makeString(s1, s2);
	}
}

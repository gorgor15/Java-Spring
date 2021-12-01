package ch20;

public class StringTest {
	public static void main(String[] args) {
		String java = new String("Java");
		String android = new String("android");
		
		System.out.println(System.identityHashCode(java));
		java = java.concat(android);
		
		System.out.println(System.identityHashCode(java));
	}
}

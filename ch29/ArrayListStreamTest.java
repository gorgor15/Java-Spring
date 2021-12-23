package ch29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Tomas");
		list.add("Edward");
		list.add("Jack");
		
		Stream<String> stream = list.stream();
		
		stream.forEach(n->System.out.println(n));
		
		list.stream().sorted().forEach(s->System.out.print(s + "\t"));
		System.out.println();
		list.stream().sorted().map(s->s.length()).forEach(n->System.out.print(n + "\t"));
		System.out.println();
		list.stream().filter(s->s.length()>=5).forEach(s->System.out.println(s));
	}
}

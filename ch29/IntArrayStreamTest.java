package ch29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntArrayStreamTest {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		
		for(int num:arr) {
			System.out.println(num);
		}
		
		System.out.println();
		IntStream is = Arrays.stream(arr);
		is.forEach(n->System.out.println(n));
		
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
		
		Arrays.stream(arr).filter(n->n>=4).forEach(s->System.out.println(s));
		
		List<String> slist = new ArrayList<String>();
		slist.add("Tomas");
		slist.add("Jongheon");
		
		Stream<String> stream = slist.stream();
		slist.stream().filter(n->n.length()>=6).forEach(n->System.out.println(n));
	}
}

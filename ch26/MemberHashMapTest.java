package ch26;

import java.util.HashMap;

public class MemberHashMapTest {
	public static void main(String[] args) {
		MemberHashMap hashMap = new MemberHashMap();
		
		Member memberK = new Member(1000,"Kim");
		Member memberL = new Member(1001,"Lee");
		Member memberE = new Member(1002,"Eul");
		Member memberD = new Member(1003,"Del");
		hashMap.addMember(memberK);
		hashMap.addMember(memberL);
		hashMap.addMember(memberE);
		hashMap.addMember(memberD);
		
		hashMap.showAllMember();
		
		HashMap<Integer, String> hash = new HashMap<Integer, String>();
		
		hash.put(1001,"Kim");
		hash.put(1002,"Lim");
		hash.put(1003,"Eim");
		hash.put(1004,"Dim");
		
		System.out.println(hash.toString());
	}
}

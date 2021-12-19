package ch25;

public class MemberArrayListTest {
	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		Member memberLee = new Member(1000, "LEE");
		Member memberKIM = new Member(1001, "KIM");
		Member memberJEE = new Member(1002, "JEE");
		Member memberREE = new Member(1003, "REE");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberKIM);
		memberArrayList.addMember(memberJEE);
		memberArrayList.addMember(memberREE);
		
		memberArrayList.showAllMember();
		memberArrayList.remove(1000);
		memberArrayList.showAllMember();
	}
}

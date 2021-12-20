package ch26;

import java.util.Comparator;

public class Member implements Comparator<Member>{
	private int memberId;
	private String memberName;
	
	public Member() {
		
	}
	public Member(int memberId,String memberName) {
		this.memberId=memberId;
		this.memberName=memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String toString() {
		return memberName + " 회원님의 아이디는" + memberId + "입니다.";
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberId==member.memberId) {
				return true;
			}
			else return false;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return memberId;
	}

	@Override
	public int compare(Member member1, Member member2) {
		// TODO Auto-generated method stub
		return (member1.memberId - member2.memberId);
	}

	//Comparable<Member>시
//	@Override
//	public int compareTo(Member member) {
//		
//		// 기존 트리에 있는 memberId값과 입력받은 member의 memberId값을 비교
////		if(this.memberId > member.memberId) {
////			return 1;
////		}else if(this.memberId<member.memberId) {
////			return -1;
////		}else {
////			return 0;
////		}
//		
//		// 오름차순 (내림차순 원할시 * (-1)해준다.
//		return (this.memberId - member.memberId)
//	}

	
	
}

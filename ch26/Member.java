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
		return memberName + " ȸ������ ���̵��" + memberId + "�Դϴ�.";
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

	//Comparable<Member>��
//	@Override
//	public int compareTo(Member member) {
//		
//		// ���� Ʈ���� �ִ� memberId���� �Է¹��� member�� memberId���� ��
////		if(this.memberId > member.memberId) {
////			return 1;
////		}else if(this.memberId<member.memberId) {
////			return -1;
////		}else {
////			return 0;
////		}
//		
//		// �������� (�������� ���ҽ� * (-1)���ش�.
//		return (this.memberId - member.memberId)
//	}

	
	
}

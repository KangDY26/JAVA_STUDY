package example;

// 407p~408p  433p~438p
public class Member implements Comparable<Member>{
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}
	
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	public String  getMemberName() {
		return memberName;
	}
	
	public void setMemberName() {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return memberName + "회원님의 아이디는 " + memberId + "입니다";
	}

	@Override
	public int compareTo(Member member) {
		return (this.memberId - member.memberId)*1;
	}
	
	

}

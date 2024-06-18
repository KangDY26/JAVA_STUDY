package test;

public class MemberTest{

	
	public static void main(String[] args) {
		Member ms = new Member("전우치", "usde01", 19);
		
		System.out.println(ms);

		ms.setAge(20);
		
		System.out.println(ms);
	}

}

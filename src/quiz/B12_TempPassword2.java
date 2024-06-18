package quiz;

import java.util.Random;

public class B12_TempPassword2 {
	/*
	 	대문자, 소문자 , 특수문자, 숫자로 구성된
	 	6자리 랜덤 비밀번호를 20개 생성하여 출력하는 프로그램을 만들어보세요
	 	// 33~57, 65~90, 97~122
	 	(ran.nextInt(26) +65)
	 	※ 비밀번호로 사용가능한 특수문자의 아스키코드 범위는 33 ~ 47
	 */
	
	public static void main(String[]args) {
		
		Random ran = new Random();
		
//		for(int i =0; i <= 20; ++i) {
//		System.out.println("");
//		for (int f =0  ; f < 2 ; ++f) {
//			System.out.print((char)(ran.nextInt(25)+33));
//			System.out.print((char)(ran.nextInt(26)+65));
//			System.out.print((char)(ran.nextInt(26)+97));
//			}
//		}System.out.println(); 
//		System.out.println("==============");
//		
//		for (int i2 = 1; i2 <= 20; ++i2) {
//			String password = "";
//			for (int i = 0; i < 2; ++i) {
//				password += (char)(Math.random()*25+33);
//				password += (char)(Math.random()*26+65);
//				password += (char)(Math.random()*26+97);
//			}
//			System.out.println(i2 + "번째 비밀번호: "+ password);
//		
//		}
		for (int i2 = 1; i2 <= 20; ++i2) {
		String password = "";
		for (int i = 0; i < 2; ++i) {
			
			password += (char)(Math.random()*25+33);
			password += (char)(Math.random()*26+65);
			password += (char)(Math.random()*26+97);
		}
	
		System.out.println(i2 + "번째 비밀번호: "+ password);
	}

	}
}



















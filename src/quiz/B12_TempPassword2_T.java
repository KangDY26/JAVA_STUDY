package quiz;

import java.util.Random;

public class B12_TempPassword2_T {
	/*
	 	대문자, 소문자 , 특수문자, 숫자로 구성된
	 	6자리 랜덤 비밀번호를 20개 생성하여 출력하는 프로그램을 만들어보세요
	 	// 33~57, 65~90, 97~122
	 	(ran.nextInt(26) +65)
	 	※ 비밀번호로 사용가능한 특수문자의 아스키코드 범위는 33 ~ 47
	 */
	
	public static void main(String[]args) {
		
		Random ran = new Random();
		// 1.
		
		for (int i = 0 ; i < 20; ++i) {
			String password = "";
			for (int KeyLen = 0; KeyLen < 6; ++KeyLen) {
				int selcet = (int)(Math.random()*4);
				
				if (selcet == 0) {
					password += (char)(Math.random()*26 +'A');				
				}else if(selcet == 1) {
					password += (char)(Math.random()*26 +'a');				
				}else if(selcet == 2) {
					password += (char)(Math.random()*15 + 33);				
				}else if(selcet == 3) {
					password += (char)(Math.random()*10 + '0');				
				}
			}
			System.out.println(i + 1 + "번째 비밀번호: "+ password);
		}	
			
		System.out.println();
		// 2.
		
		String  charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"#$%&'()*+,-./";
		
		String password = "";
		
		for (int KeyLen = 0; KeyLen < 6; ++KeyLen) {
			int rendomIndex = (int)(Math.random()*charset.length());
			password += charset.charAt(rendomIndex);
		}
		System.out.println(password);
		
		
	}
}
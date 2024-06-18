package quiz;

import java.util.Random;

public class B12_TampPassword {
	/*
	 	알파벳 대문자로만 구성된 랜덤 4자리 비밀번호 20개 생성하여 출력해보세요
	 */

	public static void main(String[] args) {
		
		Random ran = new Random();
		
//		for(int i =0; i <= 20; ++i) {
//			System.out.println("");
//			for (int f =0  ; f < 4 ; ++f) {
//				System.out.print((char)(ran.nextInt(26) +65));
//				} 
//			}
		
		for (int i2 = 0; i2 < 20; ++i2) {
			String password = "";
			for (int i = 0; i < 4; ++i) {
				password += (char)(Math.random()*26+65);			
			}
			System.out.println(i2 + "번째 비밀번호: "+ password);
		
		}
	}
}

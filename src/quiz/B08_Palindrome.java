package quiz;

import java.util.Scanner;

public class B08_Palindrome {

	/*
	  사용자가 단어를 입력하면
	  해당단어가 좌우대칭을 이루는 단어인지 판별해주는 프로그램을 만들어 보세요
	  
	  >> Level
	  -> 좌우대칭입니다
	  
	  >> Apple
	  -> 좌우대칭이 아닙니다
	  
	  >> BOB
	  -> 좌우대칭이 아닙니다
	  
	  >> ABBA
	  -> 좌우대칭입니다
	 */
	
	// 계획
	// 정상작동 문장과 역순문장 두개를 만들어 같은 값이 나오면 true 좌우대칭입니다 출력
	// 같은 값이 안나오면 false 좌우대칭이 아닙니다
	
	
	public static void main (String[] args) {
		
		String text = new Scanner(System.in).next();

		for (int i1 = 0; i1 < text.length(); ++i1) 		
			System.out.println();
		for (int i2 = text.length()-1; i2>= 0; --i2) {
		
		
		}

		
	}
}

package quiz;

import java.util.Scanner;


public class B08_Palindrome_T {

	public static void main(String[] args) {

		/*
		  사용자가 단어를 입력하면
		  해당단어가 좌우대칭을 이루는 단어인지 판별해주는 프로그램을 만들어 보세요

		  	 0 == len -1
		  	 1 == len -1 -1
		  	 2 == len -1 -2
		  	 
		  	 01234
		  >> Level
		  -> 좌우대칭입니다
		  
		  >> Apple
		  -> 좌우대칭이 아닙니다
		  
		  >> BOB
		  -> 좌우대칭이 아닙니다
		  
		  >> ABBA
		  -> 좌우대칭입니다
		 */
		
		String word = "SoS";
		
		int len= word.length();
		
		// 좌우대칭 여부를 저장해놓을 변수
		boolean isPalindrome = true;
		
		for (int i =0; i < len; ++i) {
//			System.out.printf("%c vs %c\n",
//					word.charAt(i), word.charAt(len -1 -i));
			
			
			char ch1 = word.charAt(i);
			char ch2 = word.charAt(len - 1 -i);
			
			if (ch1 != ch2) {
				isPalindrome = false;
			}
			
//			if (ch1 == ch2) {
//				System.out.printf("%d번째 검사결과 : 같은 \n", i);
//			}else {
//				System.out.printf("%d번째 검사결과 : 다름\n", i);
//			}
		}
		if(isPalindrome) {
			System.out.println("\"" + word + "\"는 좌우대칭입니다.");
		}else {
			System.out.println("\""+ word + "\"는 좌우대칭이 아닙니다");
		}

	}

}

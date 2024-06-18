package quiz;

import java.util.Scanner;

public class B08_CountE {

	/*
	 	사용자가 문장을 입력하면 해당 문장에 포함된
	 	알파벳 e의 개수를 출력하는 프로그램을 만들어보세요
	 	(※ 대/소문자 모두 개수에 포함)
	 	
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("영어 단어를 입력하시오 : ");
		String word = sc.next();
		int wordletters = word.length();
		
		for (int i = 0, cnt = 0; i <= wordletters; i++) {
			if (word.charAt(i) == i );
			System.out.print("");
		}
		
	}
}

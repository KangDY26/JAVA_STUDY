package quiz;

import java.util.Scanner;

import java.util.Random;


public class B13_ShufflesText {

	/*
	 	사용자로부터 문장을 입력받으면
	 	해당 문장의 순서를 랜덤으로 뒤섞은 결과를 만들어낸 후 출력해보세요
	 	(문장 내에 공백이 포함되어 있으면 제거할 것
	 */
	
	// 입력된 문자들을 전부 char로 바꿔 모아둔 뒤에 뒤섞는다(공백을 어떻게 빼지?)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("랜덤한 문장을 입력하시오");
		String text = sc.nextLine();
//		char ch =text.charAt(0);
//		char [] text1 = {ch};
//		System.out.println(text1);
		
		
		for(int i = 0; i <= text.length(); ++i) {
			
			System.out.println(text);
		}
		
	}
}

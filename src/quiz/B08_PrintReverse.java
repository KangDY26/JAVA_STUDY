package quiz;

import java.util.Scanner;

public class B08_PrintReverse {
	/*
	 	사용자가 문장을 입력하면 해당 문장을 거꾸로 출력해보세요
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문장을 입력하세요 : ");
		String text = sc.nextLine();
		

		int len = text.length();
		
		for (int i = text.length()-1 ; i >= 0 ; ++i ) {
		}
		System.out.println(text.charAt(text.length()-1));
		System.out.println(text.charAt(text.length()-2));

		
		
	}
}

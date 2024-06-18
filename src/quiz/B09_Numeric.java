package quiz;

import java.util.Scanner;

public class B09_Numeric {

	/*
	 	사용자가 입력한 문자열이 모두 숫자로만 구성된 문자열인지
	 	판별해주는 프로그램을 만들어보세요
	 */
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자로 구성된 문자열을 입력하시오");
		String words = sc.nextLine();
		boolean nonumber = false;
		int len = words.length();
		
		for(int i =0; i <= len; ++i) {
			if(words.charAt(i) >= 48 && words.charAt(i) <= 57) {
				//System.out.print(words.charAt(i));
				System.out.println(words +"-> 참입니다");
				nonumber = true;
				break;
			}else {
				System.out.print(words +"-> 거짓입니다");
				nonumber = false;
				break;
			}
		}
		

		
		

	
	
	
	
	
	
	
	
	
	}
}

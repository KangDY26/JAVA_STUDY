package quiz;

import java.util.Scanner;

public class D05_inJavaVariable {
	/*
	 	사용자로부터 문자열을 입력받으면
	 	해당 문자열이 자바의 변수로 사용할 수 있는 문자열인지 검사해보세요
	 */
	
	public static void main(String[] args) {
		
		System.out.println("문자열을 입력하시오");
		
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		
		boolean pos = false;
		for (int i = 0; i < word.length(); ++i) {
			if(Character.isJavaIdentifierPart(word.charAt(i))) {
				pos = true;
			}else {
				pos = false;
			}
		}
		
		if(pos) {
			System.out.println("해당 문자열은 변수로 사용할 수 있다");
		}else {
			System.out.println("해당 문자열은 변수로 사용할 수 없다");

		}
	}
}

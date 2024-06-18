package quiz;

import java.util.Scanner;


public class B08_CountE_T {
	
		/*
	 		사용자가 문장을 입력하면 해당 문장에 포함된
	 		알파벳 e의 개수를 출력하는 프로그램을 만들어보세요
	 		(※ 대/소문자 모두 개수에 포함)
		 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문장을 입력해보세요 >> ");
		String text = sc.nextLine();
		
		// 0부터 입력한 문장의 길이 -1까지 i를 반복
		int count = 0;
		int len = text.length();
		for (int i = 0; i < text.length(); ++i) {
			char ch = text.charAt(i);
			if(ch == 'e' || ch =='E') {
				++count;
			}
		}
		System.out.println("e 또는 E가 나온 횟수:" + count );

	}

}

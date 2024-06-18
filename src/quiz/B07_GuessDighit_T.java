package quiz;

import java.util.Scanner;

public class B07_GuessDighit_T {
	/*
 	(1) 사용자가 어떤 숫자를 int타입으로 입력하면 해당 숫자가 몇 자리 숫자인지 알려주는 프로그램을 만들어보세요
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해 보세요 > ");
		int num = sc.nextInt();

		
		// 4. 예상도 못했네
		System.out.println((int)Math.log10(num)+1 );
		
		
		// 3. 해결법
//		int cnt;
//		for (cnt = 0; num > 0; num /=10) {
//			++cnt;
//		}
//		System.out.println(cnt + "자리 숫자입니다.");

		
		
		// 2. 원시적 해결법을 간단하게 구현
//		int cnt = 1;
//		for(int compare = 10; compare <= num; compare *=10) {
//			++cnt;
//		}
//		
//		System.out.println(cnt + "자리 입니다.");
		
		
		// 1. 원시적 해결법
//		if (num < 0) {
//			System.out.println("한 자리 숫자입니다");
//		} else if (num < 100) {
//			System.out.println("두 자리 숫자입니다");
//		}

	}

}

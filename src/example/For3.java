package example;

import java.util.Scanner;


public class For3 {

	/*
 	사용자로부터 숫자를 입력받으면
 	0부터 해당 숫자 사이에 존재하는 모든 3의 배수를 한 줄에 6개씩 출력해보세요
 	(단, 음수를 입력 받는 경우에도 올바르게 동작해야함)
 	
	 */
	
	public static void main (String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오");
		int num = sc.nextInt();
		int cnt = 0;
		for (int i = 0; i <= num; ++i) {
			if(i % 3 == 0) {	
			System.out.printf(""+i+'\t');

			if (++cnt%6==0) {
				System.out.println();
			}
		}
		}
	
//		if (target >= 0);
//		int cnt = 0
//		for (int i = 0; i <= target; ++i) {
//			if (i % 3 == 0) {
//				// 정수와 문자타입을 더하면 문자코드 값과 정수값을 더해버린다
//				// 문자타입도 이어붙이기를 하기 위해서는 문자열과의 +가 필요하다
//				System.out.print(" "+ i + '\t');
//			
//				if (++cnt % 6 == 0) {
//					System.out.println();
//			}
//		}
//	}	
		
		
	}
	
	
}

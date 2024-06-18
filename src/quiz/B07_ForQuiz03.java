package quiz;

import java.util.Scanner;

public class B07_ForQuiz03 {

	/*
	 	사용자로부터 숫자를 입력받으면
	 	0부터 해당 숫자 사이에 존재하는 모든 3의 배수를 한 줄에 6개씩 출력해보세요
	 	(단, 음수를 입력 받는 경우에도 올바르게 동작해야함)
	 	
	 */
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오");
		int num = sc.nextInt();
		
		int backup = num;
		
		for (int i = 0, cnt = 0; i <= Math.abs(backup) ; ++i) {
			if (i % 3 == 0 ) {
				
			}else if ( num >= 0 );{
				System.out.printf("%4d", i);
			}
		}
		
	}
	
}

			
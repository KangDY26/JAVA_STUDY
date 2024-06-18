package quiz;

import java.util.Scanner;

public class B04_AppleQuiz {
	/*
	  	사과를 10개씩 담을 수 있는 바구니가 있다
	  	사용자가 사과의 개수를 입력하면 사과를 모두 담기 위해 필요한
	  	바구니의 개수를 알려주는 프로그램을 만들어보세요
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("사과의 전체 개수를 입력하시오");
		int apple = sc.nextInt();
		double basket = (apple/10);
		
		if ( apple <= 10 ) {
			System.out.println("필효한 바구니의 숫자는 : 1개 입니다 ");
		} else if (apple > 10 ) {
			System.out.println("필요한 바구니의 숫자는 : " + ((apple/10)+1) + "개 입니다.");
		} else if (apple <= 0 ) {
			System.out.println("필요한 바구니의 숫자는 0개 입니다.");
		}
	}

}

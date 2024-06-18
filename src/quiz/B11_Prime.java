package quiz;

import java.util.Scanner;

public class B11_Prime {
	
	/*
	 	
	 	사용자가 정수를 입력하면
	 	1부터 입력한 숫자 사이에 존재하는 모든 소수를 출력해보세요
	 	
	 	※ 소수(prime): 약수가 1과 자기 자신밖에 없는 수
	 	(2, 3, 5, 7, 11, ....)
	 	
	 */
	// 소수num : 2와 3을 제외하고 num%2==0 num%3==0 이외의 모든수 (x)
	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		

		// 해당소수의 곱으로 겹침
//		for (int i =0; i <= num; ++i ) {
//			if( i%2==0 || i%3 ==0 || i%5 == 0 || i%7 == 0 ) {	
//			System.out.print("");
//			}else {				
//				System.out.println(i);
//			}
//				
//		}
				
			
	}

}

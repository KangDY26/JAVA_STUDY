package quiz;

import java.util.Scanner;


public class B11_Count369_WithString_T {
	
	/*
	 	사용자가 숫자를 입력하면
	 	해당 숫자까지 369게임이 진행됬을 때 박수를 총 몇 번 쳐야하는지 출력해보세요
	 	
	 	1. 숫자를 문자열로 취급하여 검사하는 방식
	 	
	 	2. 그냥 숫자로 검사하는 방식
	 		
	 	   1의 자리에 3의 배수, 10의 자리에 3의 배수, 100의 자리에 3의 배수
	 	
	 */
	

	
	public static void main(String[] args) {
		
		// .1
		boolean DEBUG_MOD = true; //boolean DEBUG_MOD가 true일때는 과정까지 같이 출력되지만 false일때는 결과 값만 출력하게 바꿈
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력해보세요 >> ");
		int targetNum = sc.nextInt();
		
		int totalClapCount = 0;
		
		for (int i =1; i <= targetNum; ++i) {
			if (DEBUG_MOD) {
				System.out.print(i + "\t: ");				
			}
			
			String numStr = "" + i;
			
			int len = numStr.length();
			for (int index = 0; index < len; ++index) {
				char ch = numStr.charAt(index);
				if (ch == '3' || ch == '6' || ch == '9') {
					++totalClapCount;
					if (DEBUG_MOD) {
						System.out.print("짝");						
					}
				}
			}
			if (DEBUG_MOD) {				
				System.out.println();
			}
		}
		
		System.out.printf("%d까지 369를 진행하면 박수를 총 %d번 쳐야합니다.\n", targetNum, totalClapCount);
		
	}
}

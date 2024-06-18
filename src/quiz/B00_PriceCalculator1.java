package quiz;

import java.util.Scanner;


public class B00_PriceCalculator1 {
	
	/*
	 	음료수 개수를 입력하면 총 가격을 출력해보세요
	 	(음료수는 개당 2300원입니다)
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("구매한 음료수 개수를 임력하시오>");
		int count = sc.nextInt();
		
		int totalprice = 2300*count;
		
		System.out.printf("가격은 %d원 입니다", totalprice);
		
		
	}

}

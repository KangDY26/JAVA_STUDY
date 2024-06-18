package quiz;

import java.util.Scanner;

public class B00_PriceCalculator2 {
	
	/*
	 	4가지 음료수의 개수를 입력하면 총 가격을 출력해보아라
	 	(각음료수의 가격은  2300, 2800, 3300, 3500원 입니다)
	 	
	 	ex) 0 5 0 1
	 		15000
	 	
	 	
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구매한 음료수 개수를 각각 입력하시오>");
		int drink1 = sc.nextInt();
		int drink2 = sc.nextInt();
		int drink3 = sc.nextInt();
		int drink4 = sc.nextInt();
		
		int drink1price = drink1*2300;
		int drink2price = drink2*2800;
		int drink3price = drink3*3300;
		int drink4price = drink4*3500;
		
		int totaldrinkprice = drink1price+drink2price+drink3price+drink4price;
		System.out.printf("총 음료수의 가격은 %d원 입니다", totaldrinkprice);
		
	}

}

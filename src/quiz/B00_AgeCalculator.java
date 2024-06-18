package quiz;

import java.util.Scanner;


public class B00_AgeCalculator {
	
	/*
	 	
	 	이름과 태어난 년도를 입력하면 이름과 나이를 출력해주는 프롤그램을 만들어보세요
	 	
	 	ex> 김동우 1997 
	 		김동우 (28세) 출력
	 
	 */
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("이름과 태어난 년도를 입력 > ");
		String name = sc.next();
		int bron = sc.nextInt();
		int age = 2024+1-bron ;
		
		//System.out.printf("텍스트를 입력 > ");
		String text =sc.nextLine();
		System.out.printf("%s(%d세)\n", name , age);
		
		
		

	}

}

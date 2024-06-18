package quiz;

import java.util.Scanner;

public class B00_AgeCalculator_T {

	/*
	 	
	 	이름과 태어난 년도를 입력하면 이름과 나이를 출력해주는 프롤그램을 만들어보세요
	 	
	 	ex> name 1997 
	 		name (28세) 출력
	 
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름과 태어난 년도를 입력>>");
		String name = sc.next();
		int bornyear = sc.nextInt();
		int thisyear = 2024;
		
		int age = thisyear -bornyear + 1;
		
		System.out.printf("%s(%d세)\n", name, age);
		//System.out.printf(name, age);
		


	}

}

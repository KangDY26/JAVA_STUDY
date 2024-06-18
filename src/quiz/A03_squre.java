package quiz;

import java.util.Scanner;

public class A03_squre {
	
	public static void main(String[] args) {
		/*
		 	[ 조건]
		 	
		 	.문자열 변수로 직사격형 이름 입력받기
		 	. 실수형 변수로 가로, 세로 길이 입력받기
		 	. 이름과 넓이 출력하기 (이름에 쌍따옴표 넣고 넓이는 소수점 2자리까지 출력 printf 활용
		 	. 넓이가 100초과 500미만이라면 true 출력
		 	
		 	[예시]
		 	
		 	이름 입력 : 상민
		 	가로 입력 : 10.5
		 	세로 입력 : 10.5
		 	"상민" 직사격형의 넓이는 110.25
		 	true
		 	
		 */
		
		String name  = "무명";
		

		
		System.out.println("이름을 입력하시오");
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		System.out.println("가로를 입력하시오");
		double width = sc.nextDouble();
		System.out.println("세로를 입력하시오");
		double height = sc.nextDouble();
		
		double sq = width*height;
		
		System.out.printf("이름은 \"%s\". 직사각형의 넓이는 : %.2f\n", name, sq);
		
		System.out.println( 100< sq && sq <500);
		
		
	}

}

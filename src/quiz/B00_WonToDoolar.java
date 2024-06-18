package quiz;

import java.util.Scanner;

public class B00_WonToDoolar {

	/*
	 
	 	한국 돈을 입력하면 달러로 얼마인지 출력해주는 프로그램을 만들어보세요(현재 환율은 검색)
	 
	 
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("보유 현금을 입력하시오");
		int krw = sc.nextInt();
		
		//double jpy = krw/8.91;
		double usd = krw/1374.11;
		System.out.printf("%.2f달러 입니다",usd);
		//System.out.printf("%.2f달러, %.2f엔 입니다",usd, jpy);
	}
}

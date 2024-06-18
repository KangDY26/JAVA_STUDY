package quiz;

import java.util.Scanner;

public class B07_GuessDighit {
	/*
	 	(1) 사용자가 어떤 숫자를 int타입으로 입력하면 해당 숫자가 몇 자리 숫자인지 알려주는 프로그램을 만들어보세요
	 */
	// 해결1. 일일이 다 집어넣는다 ex) chat이 99999보다 크면 6자리숫자, chat이 9999보다 크면 5자리숫자
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");
		int chat = sc.nextInt();
		
		for (int i = 0, cnt = 0; i == chat ; i++) {
			if ( chat > 1000 ) {
			System.out.printf("입력한 숫자는 4자리 숫자입니다");
		} else if (chat > 100) {
			System.out.print("입력한 숫자는 3자리 숫자입니다");
		}
			
	}
}
}
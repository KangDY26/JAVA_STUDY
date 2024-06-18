package quiz;

import java.util.Scanner;

public class B05_MothToSeason {
	
	/*
	 	사용자로부터 몇 월인지 입력받으면 해당하는 계절을 출력해보세요
	 	(switch-case문, if문으로 한 번씩 만들기)
	 	
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("해당 날짜는 몇 월 입니까?");
		int month = sc.nextInt();
		
		switch (month) {
		case 11 :
		case 12 : 
		case 1:
			System.out.println("겨울 입니다.");
			break;	
		}
		switch (month) {
		case 2 :
		case 3 : 
		case 4 :
			System.out.println("봄 입니다.");
			break;	
		}
		switch (month) {
		case 5 :
		case 6 : 
		case 7:
			System.out.println("여름 입니다.");
			break;	
		}
		switch (month) {
		case 8 :
		case 9 :
		case 10:
			System.out.println("가을 입니다.");
			break;	
		}
		
		if (month >=2 && month <= 4) {
			System.out.println("봄 입니다");
		}else if (month >= 5 && month <=7){
			System.out.println("여름 입니다");
		}else if (month >= 8 && month <=10){
			System.out.println("가을 입니다.");
		}else if (month == 11 || month ==12 || month == 1 || month == 2){
			System.out.println("겨울 입니다.");

		}
	}
		
}








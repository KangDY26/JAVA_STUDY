package quiz;

import java.util.Scanner;

import java.util.Random;

public class B12_UpdownGame {
	/*
	 	# Updown 게임을 만들어보세요
	 	
	 	1. 게임이 시작되면 1~100 사이의 랜덤 숫자가 정답이 된다
	 	
	 	2. 사용자가 숫자를 입력하면 Up인지 Down인지 알려준다
	 	
	 	3. 만약 사용자가 현재 추측 범위를 벗어나는 숫자를 입력했다면 기회를 소진하지 않고 다시 입력할 수 있는 기회를 준다
	 	
	 	ex) 50
	 		Down! (남은 기회 4회)
	 		75
	 		추측 범위를 벗어난 숫자입니다...(남은 기회 4회)
	 		
	 	4. 6번 안에 못맞추면 정답이 뭐였는지 알려주고 프로그램을 종료한다
	 	
	 	5. 사용자가 정답을 맞추면 축하한다고 해주고 프로그램을 종료한다
	 	
	 */
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.println("예상 숫자를 입력");
//		int answer = sc.nextInt();
		
		for (int i = 0; i < 1; ++i) {
			int solvo = i;
			System.out.println(ran.nextInt(100) +1);
			System.out.println(solvo);
			
//			if(answer < solvo) {
//				System.out.println("Up!");
//				break;
//			}else if(answer > solvo) {
//				System.out.println("Down!");
//				break;
//			}else if(answer == solvo) {
//				System.out.println("축하합니다 정답입니다");
//				break;
//			}
		
		}
		
		
	}

}

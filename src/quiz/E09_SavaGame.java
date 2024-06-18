package quiz;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Random;
import java.util.Scanner;

public class E09_SavaGame {

	/*
	  컴퓨터가 진행하는 간단한 가위바위보 게임을 만든 후
	  프로그램 종료시 여태까지의 게임 전적을 파일에 저장해주세요
	  
	  프로그램 실행시에는 파일에 저장되어 있는 전적 데이터를 읽어 예전 기록이
	  계속해서 이어지도록 만들어보세요
	 */
	public static void main(String[] args) {
		
		
		int userDraw = 0;
		int userWin = 0;
		int userLose = 0;
		System.out.println("가위(0) 바위(1) 보(2) 종료(3)");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			int userNum = sc.nextInt();
			int comNum =(int)(Math.random()*3)+1;
			if (userNum == 0) {
				System.out.println("유저 가위");
			} else if (userNum == 1) {
				System.out.println("유저 바위");
			} else if (userNum == 2) {
				System.out.println("유저 보");
			} else if (userNum == 0) {
				System.out.println("종료합니다");
				break;
			} else {
				System.out.println("잘못된 입력입니다");
				continue;
			}
			
			if (comNum == 0) {
				System.out.println("컴퓨터 가위");
			} else if (comNum == 1) {
				System.out.println("컴퓨터 바위");
			} else if (comNum == 2) {
				System.out.println("컴퓨터 보");
			}
			if(userNum==0 && comNum==2 || userNum==1 && comNum==0 || userNum==2 && comNum==1 ) {
				System.out.println("유저가 승리하였습니다");
				userWin++;
			}else if(userNum == comNum) {
				System.out.println("비겼습니다");
				userDraw++;
			} else {
				System.out.println("유저가 패배했습니다");
				userLose++;
			}
			
			
			System.out.println("승리" + userWin + "패배" + userLose + "무승부" + userDraw);
			
		}


				
		

		
			
		
		
	}
}

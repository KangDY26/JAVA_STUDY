package quiz;

import java.util.Scanner;


public class B04_ScoreToGrade_T {

	/*
 	국어, 영어, 수학 점수를 차례대로 입력받아 평균 점수를 구한 후에
 	평균점수와 등급을 출력해주는 프로그램을 만들어보세요
 	(※ 각 과목의 유효 점수는 0~100점이고, 유효하지 않은 점수가 하나라도 있다면 평균점수는 0점, 등급은 F로 나와야한다)
 	
 	1.평균점수 90점이 이상 A
 	  평균점수 80점이 이상 B
 	  평균점수 70점이 이상 C
 	  평균점수 60점이 이상 D
 	  그 외F
 	
 */
	public static void main(String[] args) {
		
		// ctrl + shift + o : import 단축키
		Scanner sc = new Scanner(System.in);
		int kor, eng, math;
		
		System.out.println("국/영/수 점수 입력 >");
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		// 이상한 값이 있을 때 true로 변경할 수 있다
		boolean cheat = false;
		
		if (kor <0 || kor > 100) {
			System.out.println("국어 점수가 이상합니다!");
			cheat = true;
		}
		if ( eng <0 || eng > 100) {
			System.out.println("영어 점수가 이상합니다!");
			cheat = true;
		}
		if (math < 0 || math > 100) {
			System.out.println("수학 점수가 이상합니다!");
			cheat = true;
		}
		double avg;
		char grade;
		// 이상한 점수가 없으면 평균 점수를 계산
		// 이상한 점수가 있으면 그냥 점수를 넣음
		if (cheat) {
			avg = 0;
			grade = 'F';
		} else {
			avg = (kor+eng+math) / 3.0; // 평균 점수를 구하기 위해 실수로 나눈다
			
			if (avg >= 90) {
				grade = 'A';
			}else if ( avg >= 80) {
				grade = 'B';
			}else if (avg >= 70) {
				grade = 'C';
			}else if (avg >= 60) {
				grade = 'D';
			}else {
				grade= 'F';
			}
		}
		if (cheat) {
			System.out.println("잘못된 점수로 인해 0점 처리 되었습니다.");
			System.out.println("등급은" + grade + "입니다.");
		}else {
			System.out.printf("평균 점수 '%.2f'점으로 '%c'등급입니다\n", avg, grade);
		}

	}

}







package quiz;

import java.util.Scanner;

public class B04_ScoreToGrade {

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
		
		Scanner sc = new Scanner(System.in);
		int kor, eng, math;
		
//		System.out.println("국어 점수를 입력하세요.");
//		int kor = sc.nextInt();
//		System.out.println("영어 점수를 입력하세요");
//		int eng = sc.nextInt();
//		System.out.println("수학 점수를 입력하세요");
//		int math = sc.nextInt();
		System.out.println("국/영/수 점수 입력 >");
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		int total = (kor+eng+math);
		double avg = total/3.0;
		
		if (kor < 0 || kor > 100) {
			System.out.println("잘못된 국어점수 입니다");
		}
		if (eng < 0 || eng > 100) {
			System.out.println("잘못된 영어점수 입니다");
		}
		if (math < 0 || math > 100) {
			System.out.println("잘못된 수학점수 입니다");
		}
		// 이럴 경우 잘못된 점수라 뜨지만 실제로 true/false인지에 대한 구분은 안되있기 때문에 평균점과 등급을 계산해버린다
		
		
		if (kor >= 60 || eng >= 60 || math >= 60) 
			System.out.printf("평균점수는 %.2f 입니다\n", avg);
		
		if (kor < 60 || eng < 60 || math < 60) {
			System.out.println("F등급 입니다.");
		} else if (avg >= 90) {
			System.out.println("A등급 입니다.");
		} else if (avg >= 80) {
			System.out.println("B등급 입니다.");
		} else if (avg >= 70) {
			System.out.println("C등급 입니다.");
		} else if (avg >= 60) {
			System.out.println("D등급 입니다.");
	}
}



}

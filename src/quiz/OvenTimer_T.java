package quiz;

import java.util.Scanner;

public class OvenTimer_T {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int cooktime = sc.nextInt();
		
		int finishminute = minute + cooktime;
		
		if (finishminute >= 60) {
			hour = (hour + finishminute /60) % 24;
			finishminute %= 60;
		}

		System.out.printf("%d %d", hour, finishminute);
//		System.out.printf("요리 완성 예상 시간 %d시 %d분\n", 
//				hour, finishminute);
		
		
	}

}

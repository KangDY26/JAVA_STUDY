package quiz;

import java.util.Scanner;

public class B00_WonToDoolar_T {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("KRW>");
		int krw = sc.nextInt();
		
		double exchangeRate = 1373.55;
		
		double usd = krw / exchangeRate;
		
		System.out.printf("%dKRW은 %.2fUSD입니다.\n", krw, usd);

	}

}

package quiz;

import java.util.Scanner;

public class A03_squre_T {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 입력: ");
		String name = sc.next();
		System.out.println("가로 입력: ");
		double width = sc.nextDouble();
		System.out.println("세로 입력");
		double height = sc.nextDouble();
		
		double area = Math.round(width*height*100)/100.0;

		System.out.printf("\"%s\" 직사각형의 넓이는 %.2f\n", area);
	}
}

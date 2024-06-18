package quiz;

public class B07_ForQuiz2_T {

	/*
 	# for문을 사용해 숫자를 다음과 같이 출력해보세요
 	
 	1. 0 3 6 9 12...93 96 99
 	
 	2. -35 -28 -21 ... 0 7 14 ... 35
 	
 	3. 100 200 300... 1000
 	
 	4. 100부터 0까지
 	
 	5. 0부터 9까지 (30번 반복)
 	
 	6. 10부터 1까지 (30번 반복)
 	
 	7. 7 77 777 777 777 .... 7777777777
	*/
	public static void main (String[] args) {
		
		// for문 내부에서 선언한 변수는 for문의 {}가 끝나면 사라진다
		// 1. 0 3 6 9 12...93 96 99
		for (int i =0; i <=99; i +=3 ) {
			System.out.print(i +" ");
		}
		System.out.println();
		
		// 2. -35 -28 -21 ... 0 7 14 ... 35
		for (int i = -35; i <= 35; i += 7) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 3. 100 200 300... 1000
		for (int i =100; i <=1000; i += 100) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 4. 100부터 0까지
		for (int i = 100; i >= 0; --i) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 5. 0부터 9까지 (30번 반복)
		for (int i = 0; i <30; ++i ) {
			System.out.print(i % 10 + " ");
		}
		System.out.println();
		
		// 6. 10부터 1까지 (30번 반복)
		for (int i=0; i < 30; ++i) {
			System.out.print((10 - i % 10) + " ");
		}
		System.out.println();
		
		// 7. 7 77 777 777 777 .... 7777777777
		long num = 7;
		for (int i = 0; i < 10; ++i) {
			System.out.print(num + " ");
			num = num * 10+7;
		}
		System.out.println();
		
		String numStr = "";
		for (int i =0; i < 10; ++i) {
			numStr += "7";
			System.out.print(numStr + " ");
		}
	}
}
